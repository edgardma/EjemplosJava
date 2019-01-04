package pe.com.dyd.curso.junit.aserciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	public final String db = "dbGenerica";
	public final String url = "jdbc:mysql://localhost/" + db + "?";
	public final String user = "admin";
	public final String pass = "1234";
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(this.url, this.user, this.pass);
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return conn;
	}
}
