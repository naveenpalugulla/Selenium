package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	 Properties prop;
	 
	 FileInputStream fis;
	 
	 public void loadProperties() throws IOException
	 {
		 fis=new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		 
		 prop=new Properties();
		
		 prop.load(fis);
	 }
	 
	 public String getProperty(String propertyKey) throws IOException
	 {
		String propertyValue=prop.getProperty(propertyKey);
		return propertyValue;
	 }
}
