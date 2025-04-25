package br.com.devsjava.mentoriaspringsecurity.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsjava.mentoriaspringsecurity.dominio.Usuario;

@Repository
public interface UsuarioRepositorio  extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByEmail(String email);

}
