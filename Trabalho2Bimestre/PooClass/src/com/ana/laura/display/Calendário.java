package com.ana.laura.display;

public class Calendário extends Display{
	private int dia;
	private int mes;
	private int ano;
	
	public Calendário(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		formatador(String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano));
	}

}
