package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class DefinitionFixture {

    @Steps
    UtilisateurSteps utilisateur;

    @Soit("^un utilisateur sur la page d'accueil$")
    public void un_utilisateur_sur_la_page_d_accueil() throws Exception {
    	utilisateur.est_sur_la_homepage();
    }

    @Quand("^l'utilisateur cherche la définiton du mot \"([^\"]*)\"$")
    public void l_utilisateur_cherche_la_définiton_du_mot(String mot) throws Exception {
    	utilisateur.recherche(mot);
    }

    @Alors("^il devrait voir la définition \"([^\"]*)\"$")
    public void il_devrait_voir_la_définition(String definition) throws Exception {
    	utilisateur.doit_voir_la_definition(definition);
    }

}
