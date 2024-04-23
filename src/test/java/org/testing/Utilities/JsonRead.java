package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead {
	
	//input parameter- Filepath of JSON file
	//what is this method for- To read data from JSON file
	//output- as this method is going to return JSON data in form of String hence it will be of String type (like void int etc)
	
	public static String readjsonfile(String filepath) throws FileNotFoundException
	{
		File f=new File(filepath); //Connection established
		FileInputStream fs= new FileInputStream(f); //Stream object
		JSONTokener js=new JSONTokener(fs); //Tokener object
		JSONObject jo=new JSONObject(js); //Json Object object
		return jo.toString();
	}

}