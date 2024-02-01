package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.RechercheProduitPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RechercheProduitStepDef {
	
	@Given("admin is on homepage")
	public void admin_is_on_homepage() throws Exception {
		Config.ConfigChrome();
		Config.maximizeWindow();
		Config.navigate(Utils.getProperty("Tunisianet_Link"));

	}

	@When("utilisateur recherche un produit {string}")
	public void utilisateur_recherche_un_produit(String item) throws InterruptedException {
		RechercheProduitPage page = new RechercheProduitPage(Config.driver);
		page.search(item);

	}

	@Then("utilisateur verifie la resultat de recherche {string}")
	public void utilisateur_verifie_la_resultat_de_recherche(String nameP) {

		RechercheProduitPage page = new RechercheProduitPage(Config.driver);
		String actualMsg = page.verifProd();
		Assert.assertEquals(nameP, actualMsg);
	}
}
