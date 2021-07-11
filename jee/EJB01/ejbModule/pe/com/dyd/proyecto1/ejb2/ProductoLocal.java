package pe.com.dyd.proyecto1.ejb2;

import javax.ejb.Local;
import pe.com.dyd.proyecto1.dominio.Producto;

@Local
public interface ProductoLocal {
	public Producto buscarUno();
}
