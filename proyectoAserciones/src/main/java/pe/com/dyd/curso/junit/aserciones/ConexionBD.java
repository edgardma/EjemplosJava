package pe.com.dyd.curso.junit.aserciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private final String db;
	private final String url;
	private final String user;
	private final String pass;
	
	public ConexionBD(String db, String user, String pass) {
		super();
		this.db = db;
		this.url = "jdbc:mysql://localhost/" + db + "?";
		this.user = user;
		this.pass = pass;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.url + "user=" + this.user + "&password=" + this.pass);
	}
	
	public String getDb() {
		return db;
	}
	
	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

}
