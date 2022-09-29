package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
	
	public  PlanoDeSaude() {
		this.quantidade++;
	}
	
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		this.quantidade++;
	}
	
	public void setOperadora(String operadora){
		this.operadora = operadora;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	
	//Retornos
	public String getOperadora() {
		return operadora;
	}
	public String getCategoria() {
		return categoria;
	}
	public String getNumero() {
		return numero;
	}
	public LocalDate getValidade() {
		return validade;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
}
