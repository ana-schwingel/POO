package com.ana.laura.display;

import com.ana.laura.formatador.Formatador;

public abstract class Display implements Formatador {
	
	@Override
	public void formatador(String string) {
		System.out.println(string);
	}
}
