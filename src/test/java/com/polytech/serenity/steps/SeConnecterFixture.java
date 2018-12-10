package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class SeConnecterFixture {

    @Steps
    UtilisateurSteps utilisateur;
    String pseudo;    
    String erreur = "Votre nom d'utilisateur ou votre mot de passe est incorrect. Il vous reste 4 tentative(s) avant que votre compte ne soit verrouillé pendant 15 minutes";
    
    //Scénario 1

    @Lorsque("^l'identifiant est \"([^\"]*)\"$")
    public void l_utilisateur_saisit_un_identifiant(String identifiant) throws Exception {
    	pseudo=identifiant;
    	utilisateur.saisir_identifiant(identifiant);
    }
    
    @Et("^le mot de passe est \"([^\"]*)\"$")
    public void l_utilisateur_saisit_un_mot(String mot_de_passe) throws Exception {
    	utilisateur.saisir_mot_de_passe(mot_de_passe);
    }
    
    @Quand("^l'utilisateur  se connecte à son compte$")
    public void l_utilisateur_se_connecte() throws Exception {
    	utilisateur.se_connecte();
    }

    @Alors("^l'utilisateur devrait être connecté$")
    public void il_devrait_voir_son_identifiant() throws Exception {
    	utilisateur.doit_voir_son_identifiant(pseudo);
    }
    
    //Scénario 2
    @Alors("^l'utilisateur ne devrait pas être connecté$")
    public void il_ne_devrait_pas_etre_connecte() throws Exception {
    	utilisateur.doit_voir_le_message(erreur);
    }

}