package pe.com.dyd.ejemplos.spring.microservicios;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Web1 {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private static ArrayList<String> kafkamsgs = new ArrayList<String>();
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	private final String topicName = "testspring";
	private final String topicGroupId = "grupo1";
	
	public static void main(String[] args) {
		SpringApplication.run(Web1.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String home(HttpServletRequest request) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<h1>Hello World</h1>");
		
		/* Service Discovery */
		if (loadBalancer.choose(applicationName) != null) {
			sb.append("<p>Load balancer: " + loadBalancer.choose(applicationName).getInstanceId() + "</p>");
		}
		
		if (discoveryClient.getInstances(applicationName) != null) {
			sb.append("<p>Instances: " + discoveryClient.getInstances(applicationName).size() + "</p>");
		}
		
		/* Events */
		if ( request.getParameter("kafkamsg") !=null ) {
			ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("testspring", request.getParameter("kafkamsg"));
	    	
			future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
				
				public void onSuccess(SendResult<String, String> result) { 
					System.out.println( result ); 
				}
				
				public void onFailure(Throwable ex) { 
					ex.printStackTrace(); 
				}
			});   
		}
		
		sb.append( "<p>msgs: " + kafkamsgs + "</p>" );
		sb.append( "<p><form method='post' action='/'><input name='kafkamsg' /><input type='submit' value='Enviar'/></form></p>" );
		
		return sb.toString();
	}
	
	@KafkaListener(topics="testspring", groupId = topicGroupId)
	public void listenTopic2(String message) {
		kafkamsgs.add(message);
	}
}
