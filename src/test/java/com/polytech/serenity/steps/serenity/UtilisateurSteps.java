package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.polytech.serenity.pages.DictionnairePage;

import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    DictionnairePage dictionnaire;

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
}