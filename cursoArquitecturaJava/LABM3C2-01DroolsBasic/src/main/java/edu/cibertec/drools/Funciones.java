package edu.cibertec.drools;

import org.drools.runtime.rule.RuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.*;

public class Funciones {
	private static final Logger LOG = LoggerFactory.getLogger(Funciones.class);
	
	public static void report(RuleContext rc, Account account, Bonus bonus) {
		LOG.info("Regla: '" + rc.getRule().getName() + "', bouns:'"
				+ bonus.getId() + "', id:" + account.getId());
	}
}
