package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.polytech.serenity.pages.DictionnairePage;
import com.polytech.serenity.pages.ConnexionPage;
import com.polytech.serenity.pages.PokedexPage;
import com.polytech.serenity.pages.VisionnerPage;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    DictionnairePage dictionnaire;
    ConnexionPage connexion;
    PokedexPage pokedex;
    VisionnerPage visionner;

    //Recherche
    @Step
    public void saisit_mot(String motCles) {
        dictionnaire.entrer_mots_cles(motCles);
    }

    @Step
    public void lance_la_recherche() {
        dictionnaire.rechercher_mots();
    }

    @Step
    public void doit_voir_la_definition(String definition) {
        assertThat(dictionnaire.rechuperer_definitions(), hasItem(containsString(definition)));
    }

    @Step
    public void est_sur_la_homepage() {
        dictionnaire.open();
    }

    @Step
    public void recherche(String motCle) {
        saisit_mot(motCle);
        lance_la_recherche();
    }
    
    //Connexion
    @Step
    public void est_sur_la_page_de_connexion() {
        connexion.open();
    }
    
    @Step
    public void saisir_identifiant(String identifiant) {
        connexion.entrer_identifiant(identifiant);
    }
    
    @Step
    public void saisir_mot_de_passe(String mot_de_passe) {
        connexion.entrer_mot_de_passe(mot_de_passe);
    }
    
    @Step
    public void se_connecte() {
        connexion.se_connecter();
    }
    
    @Step
    public void doit_voir_son_identifiant(String identifiant) {
        identifiant.equals(connexion.recuperer_identifiant());
    }
    
    @Step
    public void doit_voir_le_message(String erreur) {
    	erreur.equals(connexion.recuperer_erreur());
    }
    
    //Oubli connexion
    @Step
    public void acces_oubli_identifiant() {
    	connexion.acces_page_oubli_identifiant();
    }
    
    @Step
    public void saisir_nom_a_l_ecran(String nom_a_l_ecran) {
    	connexion.selection_nom_a_l_ecran();
    	connexion.entrer_nom_a_l_ecran(nom_a_l_ecran);
    }
    
    @Step
    public void saisir_un_mail(String mail) {
    	connexion.entrer_mail(mail);
    }
    
    @Step
    public void recuperer_identifiant_oublie(String identifiant) {
    	connexion.recuperer_identifiant_oublie(identifiant);
    }
    
    @Step
    public void acces_oubli_mot_de_passe() {
    	connexion.acces_page_oubli_mot_de_passe();
    }
    
    @Step
    public void doit_reinitialiser_mot_de_passe() {
    	connexion.reintialiser_mot_de_passe();
    }
    
    
    //Pokédex
    @Step
    public void est_sur_la_page_du_pokedex() {
        pokedex.open();
    }
    
    @Step
    public void saisit_pokemon(String numero) {
        pokedex.entrer_numero_pokemon(numero);
    }
    
    @Step
    public void lance_la_recherche_du_pokemon() {
        pokedex.rechercher_numero();
    }
    
    @Step
    public void doit_voir_le_pokemon(String nom) {
    	nom.equals(pokedex.recuperer_nom());
    }
    
    @Step
    public void doit_voir_le_pokemon_numero(String numero) {
    	numero.equals(pokedex.recuperer_numero());
    }
    
    //Visionner pokemon
    //Episode
    @Step
    public void est_sur_la_page_serie_pokemon(){
    	visionner.acces_page_serie_pokemon();
    }
    
    @Step
    public void selectionne_episode_pokemon(String nom_episode) {
    	visionner.selection_episode(nom_episode);
    }
    
    @Step
    public void lance_l_episode() {
    	visionner.lance_l_episode();
    }
    
    @Step
    public void doit_voir_l_episode(String nomEpisode) {
    	nomEpisode.equals(visionner.recuperer_nom_episode());
    }
    
    //Film
    @Step
    public void est_sur_la_page_film_pokemon() {
    	visionner.acces_page_film_pokemon();
    }
    
    @Step
    public void selectionne_film_par_annee(String annee_film) {
    	visionner.selectionne_film(annee_film);
    }
    
    @Step
    public void doit_voir_ou_le_regarder(String nomFilm ) {
    	nomFilm.equals(visionner.recuperer_nomFilm());
    }
    
    
}