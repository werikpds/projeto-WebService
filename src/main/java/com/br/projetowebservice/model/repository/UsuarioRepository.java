package com.br.projetowebservice.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetowebservice.model.beans.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
