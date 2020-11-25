package testscripts;

import org.testng.annotations.Test;

import com.cognizant.core.DriverScript;
import com.cognizant.core.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class SeleniumPracticeScenario extends TestConfigurations {

	@Test(dataProvider = "ChromeHeadless", dataProviderClass = TestConfigurations.class)
	public void seleniumPracticeTest(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test for Selenium Practice entry test");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}


}
