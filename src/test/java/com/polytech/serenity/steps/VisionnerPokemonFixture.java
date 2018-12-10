package com.polytech.serenity.steps;
import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class VisionnerPokemonFixture {
	
    @Steps
    UtilisateurSteps utilisateur;
    String nomEpisode;
    String nomFilm="Pokémon, le film : Je te choisis !";
     
    //Episode
    @Soit("^un utilisateur sur la page série de TV pokémon$")
    public void un_utilisateur_sur_la_page_serie_pokemon() throws Exception {
    	utilisateur.est_sur_la_page_serie_pokemon();
    }
    
    @Lorsque("^l'utilisateur sélectionne l'épisode \"([^\"]*)\"$")
    public void l_utilisateur_selectionne_l_episode(String nom_episode) throws Exception {
    	nomEpisode = nom_episode;
    	utilisateur.selectionne_episode_pokemon(nom_episode);
    }
    
    @Et("^qu'il le lance$")
    public void l_utilisateur_lance_l_episode() throws Exception {
    	utilisateur.lance_l_episode();
    }
    
    @Alors("^il devrait pouvoir regarder l'épisode$")
    public void doit_voir_l_episode_selectionne() throws Exception {
    	utilisateur.doit_voir_l_episode(nomEpisode);
    }
    
    //Film
    @Soit("^un utilisateur sur la page film de TV pokémon$")
    public void un_utilisateur_sur_la_page_film_pokemon() throws Exception {
    	utilisateur.est_sur_la_page_film_pokemon();
    }
    
    @Lorsque("^l'utilisateur sélectionne le film produit en \"([^\"]*)\"$")
    public void l_utilisateur_selectionne_le_film(String annee_film) throws Exception {
    	utilisateur.selectionne_film_par_annee(annee_film);
    }
    
    @Et("^qu'il regarde où il est")
    public void qu_il_regarde_ou_il_est() throws Exception {
        // Write code here that turns the phrase above into concrete actions   
    }
    
    @Alors("^il doit savoir où pouvoir regarder le film$")
    public void doit_voir_ou_le_regarder() throws Exception {
    	utilisateur.doit_voir_ou_le_regarder(nomFilm);
    }

    @Lorsque("^il le lance$")
    public void il_le_lance() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

}
