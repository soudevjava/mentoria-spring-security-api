package br.com.devsjava.mentoriaspringsecurity.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsjava.mentoriaspringsecurity.dominio.Papel;

@Repository
public interface PapelRepositorio extends JpaRepository<Papel, Long> {

}
