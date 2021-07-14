package pe.com.dyd.clientes.basico;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import pe.com.dyd.proyecto1.ejb2.Mensaje2Remote;

public class Principal {

	public static void main(String[] args) throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context contexto = new InitialContext(jndiProperties);
		
		Mensaje2Remote servicio = (Mensaje2Remote) contexto.lookup("ejb:EAR1/EJB01/MensajeBean2!pe.com.dyd.proyecto1.ejb2.Mensaje2Remote");
		System.out.println(servicio.mensaje());
	}

}
