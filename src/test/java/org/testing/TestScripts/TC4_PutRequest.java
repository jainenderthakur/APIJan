package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JsonRead;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC4_PutRequest {
	
	@Test
	public void TC4() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties"); 
		String jsonrequestbody=JsonRead.readjsonfile("../APIJanFrame/src/test/java/org/testing/Resources/inputRequestforUpdate.json");
		
		HttpsMethods h=new HttpsMethods(pr);
		h.putmethod(jsonrequestbody, "QA_URI", TC1_PostRequest.retrunIdvalue);
	}
}