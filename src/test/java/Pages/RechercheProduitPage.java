package Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class RechercheProduitPage {
	@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
	WebElement searchItem;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	WebElement vprod;
	
	public RechercheProduitPage(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void search(String Item) throws InterruptedException {
		searchItem.sendKeys(Item+Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.urlContains(Item));
		wait.until(ExpectedConditions.elementToBeClickable(searchItem));
	}

	public String verifProd() {
		String actualMsg = vprod.getText();
		return actualMsg;

		}
}
