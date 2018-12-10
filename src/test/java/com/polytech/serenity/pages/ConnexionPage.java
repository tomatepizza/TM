package com.polytech.serenity.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://sso.pokemon.com/sso/login?locale=fr&service=https://club.pokemon.com/fr/club-des-dresseurs-pokemon/caslogin")
public class ConnexionPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    //Connexion scénario 1
    public void entrer_identifiant(String identifiant) {
    	WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	cookie.click();
    	WebElementFacade id = find(By.id("username"));
    	id.type(identifiant);
    }
    
    public void entrer_mot_de_passe(String mot_de_passe) {
    	WebElementFacade mdp = find(By.id("password"));
    	mdp.type(mot_de_passe);
    }

    public void se_connecter() {
    	WebElementFacade boutonConnexion = find(By.id("btnLogin"));
    	boutonConnexion.click();
    }

    public String recuperer_identifiant() {
    	WebElementFacade login = find(By.id("name inline"));
    	return login.getValue() ;
    }
    
    //Connexion scénario 2
    public String recuperer_erreur() {
    	WebElementFacade login = find(By.className("alert alert-error"));
    	return login.getValue() ;
    }
    
    //Oubli scénario 1
    public void acces_page_oubli_identifiant() {
    	WebElementFacade lien = find(By.xpath("//a[@href='https://club.pokemon.com/fr/club-des-dresseurs-pokemon/forgot-username']"));
    	lien.click();
    	WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	cookie.click();
    }
    
    public void selection_nom_a_l_ecran(){
    	WebElementFacade caseCochee = find(By.id("extra-choice-screen_name"));
    	caseCochee.click();
    }
    
    public void entrer_nom_a_l_ecran(String nom_a_l_ecran){
    	WebElementFacade nom = find(By.id("id_screen_name"));
    	nom.type(nom_a_l_ecran);
    }
    
    public void entrer_mail(String mail){
    	WebElementFacade email = find(By.id("id_email"));
    	email.type(mail);
    }
    
    public String recuperer_identifiant_oublie(String identifiant) {
    	WebElementFacade login = find(By.id("btn-reset"));
    	login.click();
    	return identifiant ;
    }
    
    //Oubli scénario 2
    public void acces_page_oubli_mot_de_passe() {
    	WebElementFacade boutonConnexion = find(By.xpath("//a[@href='https://club.pokemon.com/fr/club-des-dresseurs-pokemon/forgot-password']"));
    	boutonConnexion.click();
    	WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	cookie.click();
    }
    
    public void reintialiser_mot_de_passe() {
    	WebElementFacade lien = find(By.id("btn-reset"));
    	lien.click();
    }
    
    
}