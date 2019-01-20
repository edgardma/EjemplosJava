package pe.com.dyd.app.ioc;

public class UsuarioImplOracle implements IUsuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertar usuario con Oracle");
	}

	@Override
	public void eliminarUsuarioByID(int id) {
		System.out.println("Eliminar usuario con Oracle: " + id);
	}
	
}
