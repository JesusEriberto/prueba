package com.certificacion.prueba.retoDrezze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarUserInterfaces {

    public static final Target INGRESA_BOTON_PORTAL_EMPLEO = Target
            .the("Selecciona el boton de portal de empleo")
            .locatedBy("//a[@class='elementor-button-link elementor-button elementor-size-lg']");

}
