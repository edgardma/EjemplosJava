/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edgar
 */
public class JAXBUnMarshall {
    private static final Logger log = LoggerFactory.getLogger(JAXBUnMarshall.class);
    
    public static void main(String[] args) {
        try {
            File profesorXml = new File("profesor.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
            
            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            Profesor profesor = (Profesor) jaxbUnMarshaller.unmarshal(profesorXml);
            
            log.info("Datos del profesor");
            log.info("Codigo: " + profesor.getCodigo().toString());
            log.info("Nombres: " + profesor.getNombre());
            log.info("Apellidos: " + profesor.getApellido());
            log.info("Fecha de ingreso: " + profesor.getFechaIngreso());
            
        } catch (Exception e) {
            log.error("Error al realizar el marshalling", e);
        }
    }
}
