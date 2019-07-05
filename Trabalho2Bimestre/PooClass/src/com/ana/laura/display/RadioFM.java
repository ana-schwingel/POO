package com.ana.laura.display;

public class RadioFM extends Display {
	double estacação;
	
	public RadioFM(double estação) {
		this.estacação = estação;
		formatador("FM" + String.valueOf(estação) + "Mhz");
	}

}
