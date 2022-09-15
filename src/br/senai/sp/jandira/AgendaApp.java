package br.senai.sp.jandira;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("A cardiologia cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Otorrinolaringologia cuida da garganta");
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setCategoria("Ouro");
		plano.setNumero("297.834.539");
		plano.setOperadora("Porto Seguro");
		plano.setValidade(LocalDate.EPOCH);
		
		
	}

}
