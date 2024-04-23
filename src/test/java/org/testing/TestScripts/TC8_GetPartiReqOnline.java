package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC8_GetPartiReqOnline {
	
	@Test
	public void TC8() throws IOException
	{
		Properties pr=PropertiesHandle.loadpropertiesFile("../APIJanFrame/URI.properties");
		
		HttpsMethods h=new HttpsMethods(pr);
		h.getparticular("Online_URI", "3");
	}
}