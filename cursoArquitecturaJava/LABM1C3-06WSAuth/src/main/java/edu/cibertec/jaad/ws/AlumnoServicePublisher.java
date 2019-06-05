package edu.cibertec.jaad.ws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlumnoServicePublisher {
    private static final Logger LOG = 
            LoggerFactory.getLogger(AlumnoServicePublisher.class);
    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:8080/alumno", 
                new BasicAlumnoService());
        LOG.info("Servicio publicado!!");
    }
}
