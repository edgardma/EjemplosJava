package pe.com.dyd.curso.junit.teorias;

import java.sql.Connection;

import org.junit.Assume;
import org.junit.Test;

public class ConexionBDTest {
	private ConexionBD conexionDB;
	
	@Test
	public void testSuposiciones() {
		conexionDB = new ConexionBD("db", "user", "pass");
		Connection conn = null;
		try {
			
			conn = conexionDB.getConnection();
			/*
			 * Ejecutar sentencias con base de datos
			 * */
		} catch(Exception e ) {
			Assume.assumeNotNull(conn);
		}
	}
}
