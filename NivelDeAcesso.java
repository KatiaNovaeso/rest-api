package com.example.demo;

public enum NivelDeAcesso {
	
	ADM("Admin"), MST("Master"), PADRAO("Padrao");

    private String nivelDeAcesso;
	
	NivelDeAcesso (String nivelDeAcesso){
		this.nivelDeAcesso = nivelDeAcesso;
		}
	
	public String 	getNivelDeAcesso() {
		return this.nivelDeAcesso;
	}
}


