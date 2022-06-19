package com.test.model;

import java.time.LocalDateTime;

public class Celular {
	
	private String id;
	private String modelo;
	private LocalDateTime dataLancamento;
	private boolean ativo;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
