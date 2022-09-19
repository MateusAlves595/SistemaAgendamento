package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private LocalDate dataConsulta;
	private LocalTime horaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public LocalTime getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(LocalTime horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidade getEspecialidades() {
		return especialidade;
	}

	public void setEspecialidades(Especialidade especialidades) {
		this.especialidade = especialidades;
	}

}
