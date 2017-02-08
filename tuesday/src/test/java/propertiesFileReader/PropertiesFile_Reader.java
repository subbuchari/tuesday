package propertiesFileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile_Reader {

	public	Properties property ;
	public File file;
	public FileInputStream fis;

	public PropertiesFile_Reader() throws IOException
	{
		property = new Properties();
		file = new File(System.getProperty("user.dir")+"\\PropertiesFiles\\LoginCredentials.properties");
		fis = new FileInputStream(file);
		property.load(fis);
	}

	public String fileread(String keyvalue) throws IOException
	{
		String xpath = property.getProperty(keyvalue);
		return xpath;
	}

}
