package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JsonRead;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC9_PutReqOnline {
	
	@Test
	public void TC9() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties");
		String bodydata=JsonRead.readjsonfile("../APIJanFrame/src/test/java/org/testing/Resources/onlineReq.json");
		
		HttpsMethods h=new HttpsMethods(pr);
		h.putmethod(bodydata, "Online_URI", "2");
	}
	
}
