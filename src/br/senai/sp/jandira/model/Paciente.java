package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
	
        private static int contador = 99;
        private  Integer codigo;
	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private PlanoDeSaude plano;
        
        public Paciente (String nome, String rg, String cpf, LocalDate dataNascimento, String telefone, PlanoDeSaude plano){
            this.nome = nome;
            this.rg = rg;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
            this.telefone = telefone;
            this.plano = plano;
            gerarCodigo();
        }
        
        private void gerarCodigo(){
            this.contador = contador;
            this.codigo = contador;
        }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
        
        public void setCodigo(Integer codigo){
            this.codigo = codigo;
        }
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PlanoDeSaude getPlano() {
		return plano;
	}
	public void setPlano(PlanoDeSaude plano) {
		this.plano = plano;
	}
        
        public Integer getCodigo(){
            return codigo;
        }
	
	
}
