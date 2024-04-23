package org.testing.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {

	//input parameter- Filepath of properties file
	//what is this method for- To load properties file
	//output- as this method is going to return object of properties file hence it will be of Properties type (like void int etc) 
	public static Properties loadpropertiesFile(String filepath) throws IOException
	{
		File f= new File(filepath);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
	}
}