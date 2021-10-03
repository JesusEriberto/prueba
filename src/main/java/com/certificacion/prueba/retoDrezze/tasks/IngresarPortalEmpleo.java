package com.certificacion.prueba.retoDrezze.tasks;
import com.certificacion.prueba.retoDrezze.models.*;

import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class IngresarPortalEmpleo implements Task {

	 private PortalEmpleo datosIngreso;

	    public IngresarPortalEmpleo(PortalEmpleo datosIngreso) {

	        this.datosIngreso = datosIngreso;
	    }

	    @Override
	    public <T extends Actor> void performAs(T actor) {
	    	
	        actor.attemptsTo(Click.on(IngresarUserInterfaces.INGRESA_BOTON_PORTAL_EMPLEO));

	    }

	public static IngresarPortalEmpleo conDatos(PortalEmpleo datosContacto){
		return new IngresarPortalEmpleo(datosContacto);
	}
	    
}
