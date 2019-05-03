/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.json;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JAVA ARCHITECT
 */
public class JASONMarshall {
private static final Logger LOG = LoggerFactory.getLogger(
			JASONMarshall.class);
	public static void main(String[] args) {
		LOG.info("Starting...");
		Programa programa = new Programa();
		programa.setCodigo(123);
		programa.setNombre("Java Architect Application Developer");
		
		List<String> modulos = new ArrayList<String>();
		modulos.add("Fundamentos de Comunicacion de Sistemas Distribuidos");
		modulos.add("Arquitectura de Web Services y Estandares Relacionados");
		programa.setModulos(modulos);
		programa.setFechaInicio(new GregorianCalendar(2016,3,1).getTime());
		programa.setFechaFin(new GregorianCalendar(2016,6,20).getTime());
                programa.setCodigoLocal("123456");
                
                List<Curso> cursos = new ArrayList<Curso>();
                Curso curso = new Curso();
                curso.setCodigo(1);
                curso.setNombre("Curso 1");
                cursos.add(curso);
                
                curso = new Curso();
                curso.setCodigo(2);
                curso.setNombre("Curso 2");
                cursos.add(curso);
               
                programa.setCursos(cursos);
		
		try{
			File programaJson = new File("programa.json");
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.INDENT_OUTPUT, true);
			mapper.writeValue(programaJson, programa);
			LOG.info("Resultado:\n" + mapper.writeValueAsString(programa));
		}catch(Exception ex){
			LOG.error("Error al generar el archivo", ex);
		}
	}
}
