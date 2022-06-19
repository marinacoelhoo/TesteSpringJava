package com.test.model;

public class Carro {
	
	
	private String modelo;
	private String cor;
	private String id;
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", cor=" + cor + ", id=" + id + "]";
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
