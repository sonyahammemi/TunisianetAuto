package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.DisqueSSDPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisqueSSDStepDef {

	@Given("utilisateur est sur la page du produit")
	public void utilisateur_est_sur_la_page_du_produit() throws Exception {
		 Config.ConfigChrome();
	     Config.maximizeWindow();
	     Config.navigate(Utils.getProperty("DisqueSSD_Link"));;
	    
	}

	@When("utilisateur commande un produit {string}")
	public void utilisateur_commande_un_produit(String ProductName) {
        DisqueSSDPage page = new DisqueSSDPage(Config.driver);
        page.CommanderProduit(ProductName);
	}

	@Then("utilisateur verifie la commande {string}")
	public void utilisateur_verifie_la_commande(String product)   {
		DisqueSSDPage page = new DisqueSSDPage(Config.driver);
		String actualMessage = page.verifPanier();
		Assert.assertEquals(product, actualMessage);
		Config.driver.quit();
	}
}
