package testscripts;

import org.testng.annotations.Test;

import com.cognizant.core.DriverScript;
import com.cognizant.core.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class MobileTestingScenario extends TestConfigurations {

	@Test(dataProvider = "NativeAndroid", dataProviderClass = TestConfigurations.class)
	public void eriBankSendPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test for Login to EriBank App and MakePayment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
}
