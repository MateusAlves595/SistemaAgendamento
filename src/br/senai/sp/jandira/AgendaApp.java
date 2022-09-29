package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		//Criar objeto plano de saude
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperadora("Unimed");
		planoDeSaude.setCategoria("Bronze");
		planoDeSaude.setNumero("6541-6593-229-44");
		planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));
		
		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		planoDeSaude2.setOperadora("Bradesco");
		planoDeSaude2.setCategoria("Ouro");
		planoDeSaude2.setNumero("5647-9302-447-31");
		planoDeSaude2.setValidade(LocalDate.of(2023, 8, 20));
		
		//Criar objeto endereco
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Eloiso Ferreira Lopez");
		endereco.setNumero("150");
		endereco.setBairro("Vale do Sol");
		endereco.setCidade("Itapevi");
		endereco.setCep("06600-025");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setComplemento("Casa marrom com portão branco");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Gaudêncio Barbosa");
		endereco2.setNumero("82");
		endereco2.setBairro("Jardim Julieta");
		endereco2.setCidade("Itapevi");
		endereco2.setCep("06600-042");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Casa verde");
		
		//Criar objeto paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Carlos Pereira");
		paciente.setRg("50.700.252-0");
		paciente.setCpf("565.556.138-74");
		paciente.setDataNascimento(LocalDate.of(2005, 8, 19));
		paciente.setPlano(planoDeSaude);
		paciente.setEndereco(endereco);
		paciente.setTelefone("(11) 95987-5844");
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Patricia");
		paciente2.setRg("90.243.657-4");
		paciente2.setCpf("147.932.449-52");
		paciente2.setDataNascimento(LocalDate.of(2005, 8, 19));
		paciente2.setPlano(planoDeSaude2);
		paciente2.setEndereco(endereco2);
		paciente2.setTelefone("(11) 94007-9418");
		
		//Exibir dados do paciente 
		//Nome:
		//Telefone:
		//Operadora:
		//Categoria:
		//Cidade:
		//Estado;
		
		//System.out.println("Nome do Paciente: " + paciente.getNome());
		//System.out.println("Telefone: " + paciente.getTelefone());
		//System.out.println("Operadora: " + paciente.getPlano().getOperadora());
		//System.out.println("Categoria: " + paciente.getPlano().getCategoria());
		//System.out.println("Cidade: " + paciente.getEndereco().getCidade());
		//System.out.println("Estado: " + paciente.getEndereco().getEstado());
		
		//Criar especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologista");
		especialidade1.setDescricao("Cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Clinico geral");
		especialidade2.setDescricao("Sabe de tudo um pouco");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapeuta");
		especialidade3.setDescricao("Cuida dos ossos e músculos");
		
		//Criar objeto médico
		Medico medico1 = new Medico();
		medico1.setNome("Mateus Alves");
		medico1.setEmail("mateusalves5942@gmail.com");
		medico1.setTelefone("(11) 95987-5844");
		medico1.setCrm("63214-9");
		Especialidade[] especialidades1 = {especialidade1, especialidade3};
		medico1.setEspecialidades(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Roberto da Silva");
		medico2.setEmail("roberto@gmail.com");
		medico2.setTelefone("(11) 32149-2244");
		medico2.setCrm("32145-99");
		Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3};
		medico2.setEspecialidades(especialidades2);
		
		//
		
		//System.out.println("Nome do Médico: " + medico1.getNome());
		int contador = 0;
		while (contador < medico1.getEspecialidades().length){
			//System.out.println("Especialidade " + (contador+1) + " - " + medico1.getEspecialidades()[contador].getNome());
			contador++;
		}
		
		//System.out.println("=====================================");
		
		//System.out.println("Nome do Médico: " + medico2.getNome());
		int contador2 = 0;
		while (contador2 < medico2.getEspecialidades().length){
			//System.out.println("Especialidade " + (contador2+1) + " - " + medico2.getEspecialidades()[contador2].getNome());
			contador2++;
		}
		
		//Fazer o agendamento do paciente Carlos Pereira com Cardiologista 
		Agenda agenda = new Agenda();
		agenda.setPaciente(paciente);
		agenda.setMedico(medico1);
		agenda.setEspecialidades(especialidade1);
		agenda.setDataConsulta(LocalDate.of(2022, 9, 27));
		agenda.setHoraConsulta(LocalTime.of(14, 15));
	
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setMedico(medico2);
		agenda2.setEspecialidades(especialidade3);
		agenda2.setDataConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHoraConsulta(LocalTime.of(9, 30));
		
		//
		
		System.out.println("Nome do Paciente: " + agenda.getPaciente().getNome());
		System.out.println("Médico: " + agenda.getMedico().getNome());
		System.out.println("Especialidade: " + agenda.getEspecialidades().getNome());
		System.out.println("Plano de Saúde: " + paciente.getPlano().getOperadora());
		System.out.println("Categoria: " + paciente.getPlano().getCategoria());
		System.out.println("Data: " + agenda.getDataConsulta());
		System.out.println("Hora: " + agenda.getHoraConsulta());
		
		System.out.println("==================================================");
		
		System.out.println("Nome do Paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidades().getNome());
		System.out.println("Plano de Saúde: " + paciente2.getPlano().getOperadora());
		System.out.println("Categoria: " + paciente2.getPlano().getCategoria());
		System.out.println("Data: " + agenda2.getDataConsulta());
		System.out.println("Hora: " + agenda2.getHoraConsulta());
		
		
	}

}
