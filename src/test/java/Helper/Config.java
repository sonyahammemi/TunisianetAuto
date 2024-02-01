package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	public static WebDriver driver;	
	public static Actions actions;
	public static void ConfigChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", Utils.getProperty("TestDriverPath") );
		driver = new ChromeDriver();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void navigate(String url) {
		driver.get(url);
	}
	public static void attente(long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
public static void brawserQuit() {
	driver.quit();
}
}
