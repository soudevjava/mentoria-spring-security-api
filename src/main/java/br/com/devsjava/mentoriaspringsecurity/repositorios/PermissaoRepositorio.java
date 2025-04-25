package br.com.devsjava.mentoriaspringsecurity.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsjava.mentoriaspringsecurity.dominio.Permissao;

@Repository
public interface PermissaoRepositorio  extends JpaRepository<Permissao, Long> {

}
