package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 5;
		Integer b = 5;
		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		//e1.setNome("Cardiologia");
		e1.setDescricao("Não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade("Gastroenterologia");
		//e2.setNome("Gastroenterologia");
		e2.setDescricao("Não deixa com dor de barriga");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		//e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ter dor nas costas");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade("Clínico geral");
		//e4.setNome("Clínico geral");
		e4.setDescricao("Sabe de tudo um pouco");
		
		especialidades.add(e4);
		
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade("Pediatria");
		//e5.setNome("Pediatria");
		e5.setDescricao("Sabe cuidar das crianças");
		
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		System.out.println(especialidades.get(3).getNome());
		
		//trocar nome de especialidade
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		
	}

}
