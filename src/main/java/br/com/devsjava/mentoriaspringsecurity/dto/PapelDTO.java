package br.com.devsjava.mentoriaspringsecurity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devsjava.mentoriaspringsecurity.dominio.Papel;
import jakarta.validation.constraints.NotBlank;

public class PapelDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1670834717698942010L;
	
	private Long id;

	@NotBlank(message = "É obrigatório preencher o nome do papel")
	private String nome;

	private LocalDateTime dataDeCriacao;

	private boolean estado;

	public PapelDTO() {
		super();
	}
	
	public PapelDTO(Papel papel) {
		setId(papel.getId());
		setNome(papel.getNome());
		setDataDeCriacao(papel.getDataDeCriacao());
		setEstado(papel.isEstado());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
