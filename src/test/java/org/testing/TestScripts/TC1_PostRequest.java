package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JsonDataReplacer;
import org.testing.Utilities.JsonParse;
import org.testing.Utilities.JsonRead;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String retrunIdvalue;
	@Test 
	public void TC1() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties"); 
		String jsonrequestbody=JsonRead.readjsonfile("../APIJanFrame/src/test/java/org/testing/Resources/inputRequest.json");
		
		Random r=new Random();
		Integer idvalue=r.nextInt();
		
		jsonrequestbody=JsonDataReplacer.replace(jsonrequestbody,"id", idvalue.toString());
		
		HttpsMethods h=new HttpsMethods(pr);
		Response resobj=h.postmethod(jsonrequestbody, "QA_URI");
		retrunIdvalue=JsonParse.jsonpath(resobj, "id");
	}

}