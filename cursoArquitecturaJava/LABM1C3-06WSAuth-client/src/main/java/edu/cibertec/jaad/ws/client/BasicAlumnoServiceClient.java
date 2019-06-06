package edu.cibertec.jaad.ws.client;

import edu.cibertec.jaad.ws.Alumno;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.jaad.ws.AlumnoService;
import edu.cibertec.jaad.ws.BasicAlumnoServiceService;

public class BasicAlumnoServiceClient {
	private static final Logger LOG = 
			LoggerFactory.getLogger(BasicAlumnoServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/alumno?wsdl");
		QName qname = new QName(
				"http://ws.jaad.cibertec.edu/", 
				"BasicAlumnoServiceService");
		BasicAlumnoServiceService service =
				new BasicAlumnoServiceService(url, qname);
		AlumnoService port = service.getPort(AlumnoService.class);
                    /*
                    Alumno alumno = new Alumno();
                    alumno.setApellidos("Marquez");
                    alumno.setNombre("Edgard");
                    alumno.setDni("01");
                    alumno.setEdad(40);
                    port.registrar(alumno);*/
                    
		LOG.info("Response={}", port.consultar("01"));
	}
}
