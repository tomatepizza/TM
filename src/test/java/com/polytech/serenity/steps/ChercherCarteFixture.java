package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;


public class ChercherCarteFixture {
	
	@Steps
    UtilisateurSteps utilisateur; 
	
	//Scénario 1
	@Alors("^il devrait voir le pokémon nommé \"([^\"]*)\" apparaitre$")
	public void il_devrait_voir_le_pokémon_nommé_apparaitre(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Alors("^il devrait voir le pokémon de numéro \"([^\"]*)\" apparaitre$")
	public void il_devrait_voir_le_pokémon_de_numéro_apparaitre(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Soit("^un utilisateur sur la page d'encyclopédie des cartes$")
	public void un_utilisateur_sur_la_page_d_encyclopédie_des_cartes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	//Scénario 2
	@Lorsque("^l'utilisateur cherche la carte qui est l'évolution d'\"([^\"]*)\"$")
	public void l_utilisateur_cherche_la_carte_qui_est_l_évolution_d(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Alors("^il devrait voir la carte nommé \"([^\"]*)\" apparaitre$")
	public void il_devrait_voir_la_carte_nommé_apparaitre(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Lorsque("^l'utilisateur cherche une carte de type \"([^\"]*)\"$")
	public void l_utilisateur_cherche_une_carte_de_type(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Alors("^il devrait voir la carte du pokémon nommé \"([^\"]*)\" apparaitre$")
	public void il_devrait_voir_la_carte_du_pokémon_nommé_apparaitre(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

}
