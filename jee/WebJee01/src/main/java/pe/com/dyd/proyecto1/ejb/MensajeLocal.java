package pe.com.dyd.proyecto1.ejb;

import javax.ejb.Local;

@Local
public interface MensajeLocal {
	public String mensaje();
}
