package com.br.projetowebservice.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String sigla;
	@ManyToOne
	private Curso curso;
	@ManyToMany(mappedBy = "turma")
	private List<Aula> aula;
	@ManyToMany(mappedBy = "turma")
	private List<Usuario> usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Aula> getAula() {
		return aula;
	}

	public void setAula(List<Aula> aulas) {
		this.aula = aulas;
	}

}
