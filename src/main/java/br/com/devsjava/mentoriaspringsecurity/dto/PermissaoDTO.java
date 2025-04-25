package br.com.devsjava.mentoriaspringsecurity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devsjava.mentoriaspringsecurity.dominio.Permissao;
import jakarta.validation.constraints.NotBlank;

public class PermissaoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4873172530003215503L;
	
	private Long id;

	@NotBlank(message = "É obrigatório preencher o nome da permissão")
	private String nome;

	private LocalDateTime dataDeCriacao;

	private boolean estado;

	public PermissaoDTO() {
		super();
	}
	
	public PermissaoDTO(Permissao permissao) {
		setId(permissao.getId());
		setNome(permissao.getNome());
		setDataDeCriacao(permissao.getDataDeCriacao());
		setEstado(permissao.isEstado());
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
