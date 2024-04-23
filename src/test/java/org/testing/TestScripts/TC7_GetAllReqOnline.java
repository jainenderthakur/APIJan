package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC7_GetAllReqOnline {
	
	@Test
	public void TC7() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties");
		
		HttpsMethods h=new HttpsMethods(pr);
		h.getallmethod("Online_URI");
	}

}
