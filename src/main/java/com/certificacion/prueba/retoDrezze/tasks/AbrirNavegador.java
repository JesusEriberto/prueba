package com.certificacion.prueba.retoDrezze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

	
	  @Override
	    public <T extends Actor> void performAs(T actor) {
		  
	        actor.attemptsTo(Open.url("https://www.choucairtesting.com/empleos-testing/"));
	       
	    }

	public static  AbrirNavegador navegador(){

		return Tasks.instrumented(AbrirNavegador.class);
	}



}
