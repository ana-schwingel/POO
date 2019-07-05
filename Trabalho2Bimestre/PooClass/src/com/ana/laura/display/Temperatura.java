package com.ana.laura.display;

public class Temperatura extends Display {
	double temperatura; 
	
	public Temperatura(double temperatura) {
		this.temperatura = temperatura;
		formatador(String.valueOf(temperatura) + "ºC");
	}
	
}
