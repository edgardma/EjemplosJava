package edu.cibertec.drools;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.Account;
import edu.cibertec.drools.bean.Bonus;
import edu.cibertec.drools.support.KnowledgeBaseHelper;

public class TestBasicRule {
	private static final Logger LOG = LoggerFactory.getLogger(TestBasicRule.class);
	
	public static void main(String[] args) {
		prueba1();
		prueba2();
	}
	
	public static void prueba1() {
		KnowledgeBase knowledgeBase = KnowledgeBaseHelper.createKnowledgeBase("basicRule.drl");
		
		StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();
		
		try {
			LOG.info("Reglas en una ruta dentro del ambito del aplicativo...");
			LOG.info("======================================================");
			LOG.info("...ejecutando reglas.");
			Account account1 = new Account(150, "001");
			Account account2 = new Account(50, "002");
			Account account3 = new Account(120, "003");
			
			Bonus bonus1 = new Bonus(40, "GOAL");
			Bonus bonus2 = new Bonus(20, "HELP");
			
			session.insert(account1);
			session.insert(account2);
			session.insert(bonus1);
			
			session.fireAllRules();
			LOG.info("" + account1);
			LOG.info("" + account2);
			LOG.info("" + account3);
			
			session.insert(account3);
			session.insert(bonus2);
			session.fireAllRules();
			
			LOG.info("...fin de la ejecución.");
			
			LOG.info("" + account1);
			LOG.info("" + account2);
			LOG.info("" + account3);
		} catch(Exception e) {
			LOG.error("Error al ejecutar las reglas", e);
		} finally {
			session.dispose();
		}
	}

	public static void prueba2() {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newFileResource("D:\\basicRule.drl"), ResourceType.DRL);
		KnowledgeBase knowledgeBase = kbuilder.newKnowledgeBase();
		
		StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();
		
		try {
			LOG.info("Reglas en una ruta fuera del ambito del aplicativo...");
			LOG.info("======================================================");
			LOG.info("...ejecutando reglas.");
			Account account1 = new Account(150, "001");
			Account account2 = new Account(50, "002");
			Account account3 = new Account(120, "003");
			
			Bonus bonus1 = new Bonus(40, "GOAL");
			Bonus bonus2 = new Bonus(20, "HELP");
			
			session.insert(account1);
			session.insert(account2);
			session.insert(bonus1);
			
			session.fireAllRules();
			LOG.info("" + account1);
			LOG.info("" + account2);
			LOG.info("" + account3);
			
			session.insert(account3);
			session.insert(bonus2);
			session.fireAllRules();
			
			LOG.info("...fin de la ejecución.");
			
			LOG.info("" + account1);
			LOG.info("" + account2);
			LOG.info("" + account3);
		} catch(Exception e) {
			LOG.error("Error al ejecutar las reglas", e);
		} finally {
			session.dispose();
		}
	}
}
