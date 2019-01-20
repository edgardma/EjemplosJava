package pe.com.dyd.app.ioc;

public class App {
	public static void main(String[] args) {
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioByID(1);
	}
}
