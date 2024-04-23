package org.testing.Utilities;

import org.json.JSONObject;

import io.restassured.response.Response;

public class JsonParse {
	
	public static String jsonpath(Response res, String jsonpath)
	{
		String extractedvalue=res.jsonPath().get(jsonpath);
		return extractedvalue;
	}
	
	public static String orgdotjson(String res, String extractkey)
	{
		if(res.startsWith("{"))
		{
			JSONObject js=new JSONObject(res);
			return js.getString(extractkey);
		}
		
		return extractkey;
	}

}