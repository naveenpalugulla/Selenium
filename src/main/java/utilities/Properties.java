package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Properties {

	 Properties prop=new Properties();;
	 
	 FileInputStream fis;
	 
	 public String getProperty() throws FileNotFoundException
	 {
		 fis=new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		 
		 prop=new Properties();
		 
		return null;
	 }
}
