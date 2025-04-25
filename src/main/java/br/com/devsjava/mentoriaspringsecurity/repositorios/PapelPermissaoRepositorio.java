package br.com.devsjava.mentoriaspringsecurity.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsjava.mentoriaspringsecurity.dominio.PapelPermissao;

@Repository
public interface PapelPermissaoRepositorio  extends JpaRepository<PapelPermissao, Long> {

}
