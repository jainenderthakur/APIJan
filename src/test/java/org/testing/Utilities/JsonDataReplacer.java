package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonDataReplacer {
	
	public static String replace(String body, String variablename, String varibalevalue)
	{
		body=body.replaceAll(Pattern.quote("{{"+variablename+"}}"), varibalevalue);
		return body;
	}

}