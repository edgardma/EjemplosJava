package pe.com.dyd.proyecto1.ejb2;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MensajeBean2
 */
@Stateless
@LocalBean
public class MensajeBean2 implements Mensaje2Remote, Mensaje2Local {

    /**
     * Default constructor. 
     */
    public MensajeBean2() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String mensaje() {
		return "Hola desde el EJB2 en un EJB module";
	}

}
