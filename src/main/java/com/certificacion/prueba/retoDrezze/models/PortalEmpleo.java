package com.certificacion.prueba.retoDrezze.models;

public class PortalEmpleo {

	 private String usuario;
	  private String contrasena;
	  

	    public PortalEmpleo(String usuario, String contrasena) {
	        this.usuario = usuario;
	        this.contrasena = contrasena;
	    }

	    public String getUsuario() {

	        return usuario;
	    }

	    public String getContrasena()
	    {

	        return contrasena;
	    }
}