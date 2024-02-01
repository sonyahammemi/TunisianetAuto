package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class TunisianetPageHome {
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenus;
	
	public TunisianetPageHome(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenu(String menuTitle, String submenuTitle) throws Exception {
		try {
			for(WebElement menu:menus) {
				//Config.attente(10);
				if(menu.getText().contains(menuTitle)) {
					Config.actions = new Actions(Config.driver);
					Config.actions.moveToElement(menu).perform();
					//Thread.sleep(3000);
					for(WebElement submenu:submenus) {
						Thread.sleep(3000);
						if(submenu.getText().contains(submenuTitle)) {
							submenu.click();
//							WebDriverWait wait  = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
//							wait.until(ExpectedConditions.urlContains(submenuTitle));
						}
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
