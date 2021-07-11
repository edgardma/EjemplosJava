package pe.com.dyd.proyecto1.ejb;

import javax.ejb.Remote;

@Remote
public interface MensajeRemote {
	public String mensaje();
}
