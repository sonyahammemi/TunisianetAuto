package TestSuites;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Helper.Config;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class CommunStepDef {

//	@Given("utilisateur accédé la page d acceuil")
//	public void utilisateur_accédé_la_page_d_acceuil() throws Exception {
//		Config.ConfigChrome();
//		Config.maximizeWindow();
//		Config.driver.get("https://mistore.com.tn/");
//		
//
//	}
	@After
	public void tearDown(Scenario sc) {
		if(sc.isFailed()) {
			File screenShotSource = ((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
			File screenshotDestination = new File("C:\\screenshot\\failSc.png");
			try {
				FileUtils.copyFile(screenShotSource, screenshotDestination);
			}catch (Exception e) {
				// TODO: handle exception
			}
				
			}
		}
}
