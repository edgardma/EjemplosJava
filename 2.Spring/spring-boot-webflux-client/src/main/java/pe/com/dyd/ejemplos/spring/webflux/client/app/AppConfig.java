package pe.com.dyd.ejemplos.spring.webflux.client.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {
	
	@Value("${config.base.endpoint}")
	private String url;
	
	@Bean
	public WebClient registrarWebCliente() {
		return WebClient.create(url);
	}
	
}
