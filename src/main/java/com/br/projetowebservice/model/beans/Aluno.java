package com.br.projetowebservice.model.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	
}
