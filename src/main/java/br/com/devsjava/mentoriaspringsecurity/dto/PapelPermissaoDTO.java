package br.com.devsjava.mentoriaspringsecurity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devsjava.mentoriaspringsecurity.dominio.PapelPermissao;

public class PapelPermissaoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5325918230170244202L;

	private Long id;

	private Long papelId;

	private PapelDTO papel;

	private Long permissaoId;

	private PermissaoDTO permissao;

	private LocalDateTime dataDeCriacao;

	private boolean estado;

	public PapelPermissaoDTO() {
		super();
	}

	public PapelPermissaoDTO(PapelPermissao papelPermissao) {
		setId(id);
		setPapelId(papel.getId());
		setPermissaoId(permissao.getId());
		setDataDeCriacao(papelPermissao.getDataDeCriacao());
		setEstado(papelPermissao.isEstado());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPapelId() {
		return papelId;
	}

	public void setPapelId(Long papelId) {
		this.papelId = papelId;
	}

	public PapelDTO getPapel() {
		return papel;
	}

	public void setPapel(PapelDTO papel) {
		if (papel != null)
			this.setPapelId(papel.getId());
		this.papel = papel;
	}

	public Long getPermissaoId() {
		return permissaoId;
	}

	public void setPermissaoId(Long permissaoId) {
		this.permissaoId = permissaoId;
	}

	public PermissaoDTO getPermissao() {
		return permissao;
	}

	public void setPermissao(PermissaoDTO permissao) {
		if (permissao != null)
			this.setPermissaoId(permissao.getId());
		this.permissao = permissao;
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
