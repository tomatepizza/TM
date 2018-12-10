package com.polytech.serenity.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import cucumber.api.java.fr.Alors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.pokemon.com/fr/episodes-pokemon/")
public class VisionnerPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;
    
    //Scénario 1 Episode
    
    public void acces_page_serie_pokemon() {
    	//WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	//cookie.click();
    }
    
    @WhenPageOpens
    public void waitUntilTitleAppears() {
    	WebElementFacade episode = find(By.className("fr episode"));
    	element(episode).waitUntilVisible();
    }
    
    
    public void selection_episode(String nom_episode){
    	WebElementFacade episode = find(By.className("fr episode"));
    	element(episode).waitUntilVisible();
    	episode.click();
    }
    
    public void lance_l_episode(){
    	WebElementFacade episode = find(By.className("video-play-button"));
    	episode.click();
    	WebElementFacade pleinEcran = find(By.className("vjs-fullscreen-control vjs-control vjs-button"));
    	pleinEcran.click();
    }
    
    public String recuperer_nom_episode(){
    	WebElementFacade nom_episode = find(By.className("episodeTitle"));
    	return nom_episode.getValue() ;
    }   
    
    //Scénario 2 Film
    public void acces_page_film_pokemon() {
    	//WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	//cookie.click();
    	WebElementFacade film = find(By.className("banner banner-right banner-gray"));
    	film.click();
    	
    }
  
    public void selectionne_film(String annee_film){
    	WebElementFacade film = find(By.className("season-info"));
    	film.click();
    }
  
    public String recuperer_nomFilm(){
    	WebElementFacade nom_film = find(By.className("fr-title"));
    	return nom_film.getValue() ;
    }

}

