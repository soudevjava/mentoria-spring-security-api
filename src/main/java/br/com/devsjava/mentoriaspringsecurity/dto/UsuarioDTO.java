package br.com.devsjava.mentoriaspringsecurity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devsjava.mentoriaspringsecurity.dominio.Usuario;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4764055850081581305L;
	
	private Long id;
	
	@NotBlank(message = "É obrigatório preencher o nome do usuário")
	private String nome;
	
	@NotBlank(message = "É obrigatório preencher o email do usuário")
	private String email;
	
	private LocalDateTime dataDeCriacao;
	
	private boolean estado;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Usuario usuario) {
		setId(usuario.getId());
		setNome(usuario.getNome());
		setEmail(usuario.getEmail());
		setDataDeCriacao(usuario.getDataDeCriacao());
		setEstado(usuario.isEstado());
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
