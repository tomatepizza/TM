package com.polytech.serenity.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.pokemon.com/fr/pokedex/")
public class PokedexPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;


    public void entrer_numero_pokemon(String numero) {
    	WebElementFacade cookie = find(By.id("cookie-dismisser"));
    	cookie.click();
    	WebElementFacade id = find(By.id("searchInput"));
    	id.type(numero);
    }
    
    public void rechercher_numero() {
    	WebElementFacade boutonRecherche = find(By.id("search"));
    	boutonRecherche.click();
    }

    public String recuperer_nom() {
    	WebElementFacade nom = find(By.className("id"));
    	return nom.getValue() ;
    }
    
    public String recuperer_numero() {
    	WebElementFacade numero = find(By.className("number-prefix"));
    	return numero.getValue() ;
    }
}

