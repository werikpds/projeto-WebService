package com.br.projetowebservice.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "disciplina")
public class Disciplina implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String descricao;
	@OneToMany(mappedBy = "disciplina")
	private List<Aula> aulas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
