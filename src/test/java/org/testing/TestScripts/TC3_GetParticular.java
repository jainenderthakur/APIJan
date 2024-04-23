package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetParticular {
	
	@Test
	public void TC3() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties");
		HttpsMethods h=new HttpsMethods(pr);
		h.getparticular("QA_URI", TC1_PostRequest.retrunIdvalue);
	}
}