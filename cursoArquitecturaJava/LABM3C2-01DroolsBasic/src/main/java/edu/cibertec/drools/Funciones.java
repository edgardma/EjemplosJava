package edu.cibertec.drools;

import org.drools.runtime.rule.RuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.*;

public class Funciones {
	private static final Logger LOG = LoggerFactory.getLogger(Funciones.class);
	
	// Fuente: https://www.lawebdelprogramador.com/codigo/Java/2518-Determinar-nuestro-sistema-operativo-version-y-arquitectura.html
    private static String OS = System.getProperty("os.name").toLowerCase();
	
	public static void report(RuleContext rc, Account account, Bonus bonus) {
		LOG.info("Regla: '" + rc.getRule().getName() + "', bouns:'"
				+ bonus.getId() + "', id:" + account.getId());
	}
	
    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }
    
    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }
    
    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
}
