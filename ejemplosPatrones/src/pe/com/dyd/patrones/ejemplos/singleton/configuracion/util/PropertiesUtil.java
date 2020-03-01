package pe.com.dyd.patrones.ejemplos.singleton.configuracion.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	public static Properties loadProperty(String propertiesUrl) {
		try {
			Properties properties = new Properties();
			
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesUrl);
			properties.load(inputStream);
			
			return properties;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
