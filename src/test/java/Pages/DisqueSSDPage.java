package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueSSDPage {

	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
	WebElement verifPage;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> ListeProduits;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement AjoutProduit;

	@FindBy(xpath="/html/body/div[10]/div/div/div/div[1]/div/div/div[2]/h6")
	WebElement vpanier;
	
	public DisqueSSDPage(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifPage() {
		String actualMsg = verifPage.getText();
		return actualMsg;		
	}
	
	public void CommanderProduit(String product) {
		try {
			for(WebElement produit:ListeProduits) {
				if(produit.getText().contains(product)) {
					produit.click();
					Config.attente(10);
					AjoutProduit.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public String verifPanier()   {
		String actualMessage = vpanier.getText();
		return actualMessage;
	}
}
