package com.br.projetowebservice.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	@ManyToOne
	private Professor professor;
	@ManyToOne
	private Disciplina disciplina;
	@ManyToMany
	@JoinTable(
				name = "turma_aula",
				joinColumns = @JoinColumn (name = "aula_id"),
				inverseJoinColumns = @JoinColumn (name = "turma_id")
			)
	private List<Turma> turma;
	private Date horario;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professorUsuarioId) {
		this.professor = professorUsuarioId;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplinaId) {
		this.disciplina = disciplinaId;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public List<Turma> getTurma() {
		return turma;
	}
	public void setTurma(List<Turma> turmas) {
		this.turma = turmas;
	}
	
}
