package edu.cibertec.drools.reglas;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.support.KnowledgeBaseHelper;

public class KnowledgeBaseLocal implements IKnowledgeBaseCustom {

	private static final Logger LOG = LoggerFactory.getLogger(KnowledgeBaseLocal.class);
	private static final String nombreArchivoReglas = "basicRule.drl";
	
	@Override
	public StatefulKnowledgeSession createKnowledgeBase() {
		LOG.info("======================================================");
		LOG.info("Reglas en una ruta dentro del ambito del aplicativo...");
		LOG.info("======================================================");
		
		KnowledgeBase knowledgeBase = KnowledgeBaseHelper.createKnowledgeBase(nombreArchivoReglas);
		
		return knowledgeBase.newStatefulKnowledgeSession();
	}

}
