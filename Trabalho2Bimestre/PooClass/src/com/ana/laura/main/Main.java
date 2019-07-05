package com.ana.laura.main;

import com.ana.laura.display.Calendário;
import com.ana.laura.display.RadioFM;
import com.ana.laura.display.RadioRelogio;
import com.ana.laura.display.Temperatura;

public class Main {

	public static void main(String[] args) {
		RadioRelogio radiorelogio = new RadioRelogio(10, 30);
		Calendário calendario = new Calendário(05, 05, 2019);
		RadioFM radioFM = new RadioFM(105.3);
		Temperatura temperatura = new Temperatura(10.4);
	}
}
