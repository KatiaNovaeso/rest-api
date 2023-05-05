package com.example.demo;

public enum Sexo {
	M("Masculino"),
	F("Feminio"),
	O("Outros");

	private String sexo;

	Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {return this.sexo;}
}

