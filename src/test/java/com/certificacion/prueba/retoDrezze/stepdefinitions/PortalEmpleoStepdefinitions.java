package com.certificacion.prueba.retoDrezze.stepdefinitions;


import com.certificacion.prueba.retoDrezze.models.PortalEmpleo;
import com.certificacion.prueba.retoDrezze.tasks.AbrirNavegador;
import com.certificacion.prueba.retoDrezze.tasks.IngresarPortalEmpleo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PortalEmpleoStepdefinitions {


    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));

        theActorCalled("Elvis");
    }

    @Given("^que (.*) esta en el portal$")
    public void queJesusEstaEnElPortal(Actor actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());
    }

}
