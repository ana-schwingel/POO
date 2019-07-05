package com.ana.laura.display;

public class RadioRelogio extends Display{
	
	private int hora;
	private int minuto;
	
	public RadioRelogio(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		formatador(String.valueOf(hora) + ":" + String.valueOf(minuto));
	}
	
	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
}
