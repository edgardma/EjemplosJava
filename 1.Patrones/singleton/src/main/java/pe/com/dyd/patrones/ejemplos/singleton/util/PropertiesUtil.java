package pe.com.dyd.patrones.ejemplos.singleton.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties loadProperty(String propertiesURL) {
		try {
			System.out.println(propertiesURL);
			Properties properties = new Properties();
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);
			properties.load(inputStream);
			return properties;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private PropertiesUtil() {
		
	}

}
