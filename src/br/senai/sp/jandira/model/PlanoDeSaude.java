package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

        private static int contador = 99;
        private Integer codigo;
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;

    
        
        //Construtores
        
        public PlanoDeSaude(){
            this.contador++;
            this.codigo = contador;
            gerarCodigo();
        }
        
        public PlanoDeSaude(String numero, String operadora, String categoria, LocalDate validade){
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero =  numero;
            this.validade = validade;
            gerarCodigo();
            
        }
        
	private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
        }
	
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		gerarCodigo();
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
        
        public void setCodigo(Integer codigo){
            this.codigo = codigo;
        }
	
	//Retornos
        
        public int getContador(){
            return contador;
        }
        
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
        
        public Integer getCodigo() {
            return codigo;
        }
	
	
}
