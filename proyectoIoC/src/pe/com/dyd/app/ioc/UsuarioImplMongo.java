package pe.com.dyd.app.ioc;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertar usuario con Mongo");
	}

	@Override
	public void eliminarUsuarioByID(int id) {
		System.out.println("Eliminar usuario con Mongo: " + id);
	}

}
