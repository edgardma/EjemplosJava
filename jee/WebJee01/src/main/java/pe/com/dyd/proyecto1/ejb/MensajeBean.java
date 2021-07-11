package pe.com.dyd.proyecto1.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class MensajeBean
 */
@Stateless
public class MensajeBean implements MensajeRemote, MensajeLocal {

    /**
     * Default constructor. 
     */
    public MensajeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String mensaje() {
		return "Hola desde un EJB de Session";
	}

}
