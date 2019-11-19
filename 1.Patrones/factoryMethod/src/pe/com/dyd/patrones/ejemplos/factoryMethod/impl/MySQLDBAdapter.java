package pe.com.dyd.patrones.ejemplos.factoryMethod.impl;

import java.sql.Connection;

import pe.com.dyd.patrones.ejemplos.factoryMethod.IDBAdapter;

public class MySQLDBAdapter implements IDBAdapter {
	
	private static final String DB_PROPERTIES = "META-INF/DBMySQL.properties";
	private static final String DB_NAME_PROP = "dbname";
	private static final String DB_PASSWORD_PROP = "password";
	private static final String DB_PORT_PROP = "port";
	private static final String DB_USER_PROP= "user";
	
	static {
		try {
			//new com.mysql.jdbc.Driver();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() {
		
		return null;
	}

}
