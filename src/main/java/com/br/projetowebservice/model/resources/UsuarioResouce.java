package com.br.projetowebservice.model.resources;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.projetowebservice.model.beans.Usuario;
import com.br.projetowebservice.model.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResouce {
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@PostMapping("/salvar")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario, HttpServletResponse response){
		Usuario u 	= this.usuarioRepo.save(usuario);
		URI uri	= ServletUriComponentsBuilder.fromCurrentServletMapping()
				.path("/{id}")
				.buildAndExpand(u.getId())
				.toUri();
		return ResponseEntity.created(uri).body(u);
	}
	
	@GetMapping("/{id}")
	public Usuario buscarAlunoPeloId(@PathVariable int id){
		return this.usuarioRepo.getOne(id);
	}
}
