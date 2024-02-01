package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.DisqueSSDPage;
import Pages.TunisianetPageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomepageStepDef {

	@Given("utilisateur est sur la page d acceuil")
	public void utilisateur_est_sur_la_page_d_acceuil() throws Exception {
        Config.ConfigChrome();
        Config.maximizeWindow();
        Config.navigate(Utils.getProperty("Tunisianet_Link"));
        
       
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur le submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_submenu(String menu, String submn) throws Exception {
        TunisianetPageHome page = new TunisianetPageHome(Config.driver);
        page.mouseHoverOnMenu(menu, submn);
	}

	@Then("utilisateur est dirigé vers la page de {string}")
	public void utilisateur_est_dirigé_vers_la_page_de(String NomProduit) {
		DisqueSSDPage produit = new DisqueSSDPage(Config.driver);
		String actualMsg = produit.verifPage();
		Assert.assertEquals(NomProduit, actualMsg);
		Config.driver.quit();
	}

}
