/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.ws;

import javax.xml.ws.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraPublisher {
    private static final Logger LOG = LoggerFactory.getLogger(CalculadoraPublisher.class);
    
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/calcws", new BasicCalculadora());
        LOG.info("Servicio publicado...");
    }
}
