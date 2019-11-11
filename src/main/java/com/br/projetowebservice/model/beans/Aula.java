package com.br.projetowebservice.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Disciplina disciplina;
	private String horario;
	@ManyToMany
	@JoinTable(name = "turma_aula", joinColumns = @JoinColumn(name = "aula_id"), inverseJoinColumns = @JoinColumn(name = "turma_id"))
	private List<Turma> turma;

	public String getHorario() {
		return horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplinaId) {
		this.disciplina = disciplinaId;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turmas) {
		this.turma = turmas;
	}

}
