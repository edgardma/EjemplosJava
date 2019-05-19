/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JAVA ARCHITECT
 */
public class BasicCalculadoraClient {
    private static final Logger LOG = LoggerFactory.getLogger(BasicCalculadoraClient.class);
    
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/calcws?wsdl");
        
        QName qname = new QName("http://ws.jaad.cibertec.edu/", "BasicCalculadoraService");
        
        BasicCalculadoraService service = new BasicCalculadoraService(url, qname);
        Calculadora calc = service.getPort(Calculadora.class);
        
        LOG.info("Sumar = {}", calc.sumar(5, 10));
        LOG.info("Restar = {}", calc.sumar(5, 10));
    }
    
}
