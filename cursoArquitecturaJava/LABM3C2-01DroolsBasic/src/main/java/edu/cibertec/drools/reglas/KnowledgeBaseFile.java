package edu.cibertec.drools.reglas;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.Funciones;

public class KnowledgeBaseFile implements IKnowledgeBaseCustom {
	
	private static final Logger LOG = LoggerFactory.getLogger(KnowledgeBaseFile.class);
	private static final String nombreArchivoReglas = "basicRule.drl";	
	
	@Override
	public StatefulKnowledgeSession createKnowledgeBase() {
		LOG.info("======================================================");
		LOG.info("Reglas en una ruta fuera del ambito del aplicativo...");
		LOG.info("======================================================");
		
		String rutaArchivoReglas = "";
		
		if (Funciones.isWindows()) {
			rutaArchivoReglas = "D:\\" + nombreArchivoReglas;
		} else {
			rutaArchivoReglas = "/home/emarquez/" + nombreArchivoReglas;
		}
			
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newFileResource(rutaArchivoReglas), ResourceType.DRL);
		KnowledgeBase knowledgeBase = kbuilder.newKnowledgeBase();
		
		return knowledgeBase.newStatefulKnowledgeSession();
	}
	
}
