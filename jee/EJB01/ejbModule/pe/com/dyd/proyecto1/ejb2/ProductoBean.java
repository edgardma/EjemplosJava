package pe.com.dyd.proyecto1.ejb2;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.com.dyd.proyecto1.dominio.Producto;

/**
 * Session Bean implementation class ProductoBean
 */
@Stateless
@LocalBean
public class ProductoBean implements ProductoRemote, ProductoLocal {

    /**
     * Default constructor. 
     */
    public ProductoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Producto buscarUno() {
		// TODO Auto-generated method stub
		return new Producto(1, "auricular", 200);
	}

}
