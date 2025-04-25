package br.com.devsjava.mentoriaspringsecurity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devsjava.mentoriaspringsecurity.dominio.UsuarioPapel;

public class UsuarioPapelDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603853641677744813L;
	
	private Long id;
	
	private UsuarioDTO usuario;
	
	private Long usuarioId;
	
	private PapelDTO papel;
	
	private Long papelId;
	
	private LocalDateTime dataDeCriacao;
	
	private boolean estado;

	public UsuarioPapelDTO() {
		super();
	}
	
	public UsuarioPapelDTO(UsuarioPapel usuarioPapel) {
		setId(usuarioPapel.getId());
		setUsuarioId(usuarioPapel.getUsuarioId());
		setPapelId(usuarioPapel.getPapelId());
		setDataDeCriacao(usuarioPapel.getDataDeCriacao());
		setEstado(usuarioPapel.isEstado());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		if(usuario != null) this.setUsuarioId(usuario.getId());
		this.usuario = usuario;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public PapelDTO getPapel() {
		return papel;
	}

	public void setPapel(PapelDTO papel) {
		if(papel != null) this.setPapelId(papel.getId());
		this.papel = papel;
	}

	public Long getPapelId() {
		return papelId;
	}

	public void setPapelId(Long papelId) {
		this.papelId = papelId;
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
