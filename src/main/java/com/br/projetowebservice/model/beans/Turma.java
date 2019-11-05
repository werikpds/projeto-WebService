package com.br.projetowebservice.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "turma")
public class Turma implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	
	private String sigla;
	
	
	/*@JoinTable(name			="turma_has_aluno", 
				joinColumns = @JoinColumn(name = "turma_id"),
				inverseJoinColumns = @JoinColumn (name = "aluno_usuario_Id"))*/
	@ManyToMany
	private List <Aluno> aluno;
	
	@ManyToOne
	private Curso curso;
	
	@ManyToMany (mappedBy = "turma")
	private List<Aula> aula;
	
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
	
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> alunos) {
		this.aluno = alunos;
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
