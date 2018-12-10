package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class ChercherPokemonFixture {

    @Steps
    UtilisateurSteps utilisateur;   

    @Soit("^un utilisateur sur la page du Pokédex$")
    public void un_utilisateur_sur_la_page_du_pokedex() throws Exception {
    	utilisateur.est_sur_la_page_du_pokedex();
    }
    
    //Recherche par numéro
    @Lorsque("^l'utilisateur cherche le pokémon numéro \"([^\"]*)\"$")
    public void l_utilisateur_saisit_un_numero(String numero) throws Exception {
    	utilisateur.saisit_pokemon(numero);
    	utilisateur.lance_la_recherche_du_pokemon();
    }
    
    @Alors("^il devrait voir le pokémon nommé \"([^\"]*)\"  apparaitre$")
    public void doit_voir_le_pokemon(String nom_pokemon) throws Exception {
    	utilisateur.doit_voir_son_identifiant(nom_pokemon);
    }
    
    //Recherche par nom
    @Lorsque("^l'utilisateur cherche le pokémon nommé \"([^\"]*)\"$")
    public void l_utilisateur_saisit_un_nom(String nom) throws Exception {
    	utilisateur.saisit_pokemon(nom);
    	utilisateur.lance_la_recherche_du_pokemon();
    }
    
    @Alors("^il devrait voir le pokémon de numéro \"([^\"]*)\"  apparaitre$")
    public void doit_voir_le_pokemon_numero(String numero_pokemon) throws Exception {
    	utilisateur.doit_voir_son_identifiant(numero_pokemon);
    }
}