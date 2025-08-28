package com.ana.estruturadados.vetor;


public class Vetor {

	private String[] elementos;

	public Vetor(int capacidade) {
		this.setElementos(new String[capacidade]);
	}

	public String[] getElementos() {
		return elementos;
	}

	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}
	
	
}
