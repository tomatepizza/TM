package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class OubliIdentifiantFixture {
    @Steps
    UtilisateurSteps utilisateur;  
    String erreur = "Votre nom d'utilisateur ou votre mot de passe est incorrect. Il vous reste 4 tentative(s) avant que votre compte ne soit verrouillé pendant 15 minutes";
        
    //Scénario 1
    @Soit("^un utilisateur sur la page de connexion au site$")
    public void un_utilisateur_sur_la_page_de_connexion() throws Exception {
    	utilisateur.est_sur_la_page_de_connexion();
    }
    
    @Lorsque("^qu'il a oublié son nom d'utilisateur$")
    public void l_utilisateur_a_oublie_le_nom_d_utilisateur() throws Exception {
    	utilisateur.acces_oubli_identifiant();
    }
    
    @Et("^que le nom a l'écran est \"([^\"]*)\"$")
    public void l_utilisateur_saisit_son_nom_a_l_ecran(String nom_a_l_ecran) throws Exception {
    	utilisateur.saisir_nom_a_l_ecran(nom_a_l_ecran);
    }
    
    @Et("^l'adresse mail  \"([^\"]*)\"$")
    public void l_utilisateur_saisit_un_mail(String mail) throws Exception {
    	utilisateur.saisir_un_mail(mail);
    }
    
    @Alors("^l'utilisateur devrait voir apparaitre son identifiant \"([^\"]*)\"$")
    public void l_utilisateur_recupere_son_identifiant(String identifiant) throws Exception {
    	utilisateur.recuperer_identifiant_oublie(identifiant);
    }

    //Scénario 2
    @Lorsque("^qu'il a oublié son mot de passe$")
    public void l_utilisateur_a_oublie_son_mot_de_passe() throws Exception {
    	utilisateur.acces_oubli_mot_de_passe();
    }
    
    @Alors("^l'utilisateur devrait pouvoir réinitialiser son mot de passe$")
    public void il_devrait_reinitialiser_mot_de_passe() throws Exception {
    	utilisateur.doit_reinitialiser_mot_de_passe();
    }
    

}
