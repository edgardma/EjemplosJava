package pe.com.dyd.app.ioc;

public class UsuarioFactory {
	
	IUsuario usuario;
	
	public UsuarioFactory(IUsuario usuario) {
		this.usuario = usuario;
	}

	public void getInsertaUsuario() {
		usuario.insertarUsuario();
	}
	
	public void getEliminaUsuarioByID(int id) {
		usuario.eliminarUsuarioByID(id);
	}
}
