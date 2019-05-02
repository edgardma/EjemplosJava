/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.jaxb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edgar
 */
public class JAXBMarshall {
    private static final Logger log = LoggerFactory.getLogger(JAXBMarshall.class);
    
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Profesor profesor = new Profesor();
        
        profesor.setCodigo(123456);
        profesor.setNombre("Juan");
        profesor.setApellido("Perez");
        profesor.setFechaIngreso(new GregorianCalendar(2010, 10, 21).getTime());
        
        try {
            File profesorXml = new File("profesor.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            jaxbMarshaller.marshal(profesor, profesorXml);
            jaxbMarshaller.marshal(profesor, baos);
            
            log.info("\n" + new String(baos.toByteArray()));
                    
        } catch(Exception e) {
            log.error("Error al realizar el marshalling", e);
        }
    }
}
