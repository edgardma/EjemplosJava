package pe.com.dyd.curso.junit.aserciones;

import java.sql.Connection;
import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConexionBDTest {
	
	private static final String BD = "dbgenerica";
	private static final String USER = "root";
	private static final String PASS = "";
	private static final String INVALID_USER = "noValido";
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	private ConexionBD conexionBD;
	
	@Test
	public void conexionCorrecta() {
		conexionBD = new ConexionBD(BD, USER, PASS);
		Connection con = null;
		
		try {
			con = conexionBD.getConnection();
		} catch (SQLException e) {
			//e.printStackTrace();
			Assert.fail("La conexión a fallado");
		}
		
		Assert.assertThat(con, Matchers.notNullValue());
	}
	
	@Test
	public void conexionFallida() {
		conexionBD = new ConexionBD(BD, INVALID_USER, PASS);
		Connection con = null;
		
		try {
			con = conexionBD.getConnection();
			Assert.fail("La conexión a fallado");
		} catch (SQLException e) {
			Assert.assertThat(e, Matchers.isA(SQLException.class));
			Assert.assertThat(e.getMessage(), Matchers.startsWith("Access denied"));
			Assert.assertThat(e.getMessage(), Matchers.containsString("Access denied"));
			Assert.assertThat(e.getSQLState(), Matchers.is("42000"));
			//e.printStackTrace();
		}
		
		Assert.assertThat(con, Matchers.nullValue());
	}
	
	@Test(expected = SQLException.class)
	public void conexionFallidaAnotaciones() throws SQLException {
		conexionBD = new ConexionBD(BD, INVALID_USER, PASS);
		conexionBD.getConnection();
		//Assert.fail("La conexión a fallado");
	}
	
	@Test
	public void conexionFallidaRegla() throws SQLException {
		exception.expect(SQLException.class);
		exception.expectMessage("Access denied for user");
		exception.expectMessage("denied for user");
		exception.expectMessage("Access denied");
		//exception.expectMessage(Matchers.equalTo(""));
		exception.expectMessage(Matchers.containsString("denied for user"));
		
		conexionBD = new ConexionBD(BD, INVALID_USER, PASS);
		conexionBD.getConnection();
		//Assert.fail("La conexión a fallado");
	}
}
