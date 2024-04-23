package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JsonRead;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostReqOnline {
	
	public static String returnIdvalue;
	
	@Test
	public String TC6() throws IOException
	{			
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties");
		String bodydata=JsonRead.readjsonfile("../APIJanFrame/src/test/java/org/testing/Resources/onlineReq.json");
		
		HttpsMethods h=new HttpsMethods(pr);
		Response res=h.postmethod(bodydata, "Online_URI");
		return returnIdvalue=res.asString();
	}
}