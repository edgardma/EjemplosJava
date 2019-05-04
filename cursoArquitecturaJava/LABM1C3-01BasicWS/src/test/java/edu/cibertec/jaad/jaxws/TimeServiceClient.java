/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JAVA ARCHITECT
 */
public class TimeServiceClient {
    private static final Logger LOG = LoggerFactory.getLogger(TimeServiceClient.class);
    
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/timeService?wsdl");
        
        QName qname = new QName("http://jaxws.jaad.cibertec.edu/", "BasicTimeServiceService");
        Service service = Service.create(url, qname);
        TimeService servicePort = service.getPort(TimeService.class);
        
        String time = servicePort.getTimeAsString();
        Long date = servicePort.getTimeAsElapsed();
        LOG.info("Time: " + time);
        LOG.info("Time: " + date);
    }
}
