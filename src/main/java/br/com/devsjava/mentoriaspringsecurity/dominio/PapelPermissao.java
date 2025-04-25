package br.com.devsjava.mentoriaspringsecurity.dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "papel_permissoes")
public class PapelPermissao extends EntidadeBase {

    /**
	 * 
	 */
	private static final long serialVersionUID = -374885989867570728L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "papel_id", nullable = false)
	private Long papelId;

    @ManyToOne
    @JoinColumn(name = "papel_id", updatable = false, insertable = false)
    private Papel papel;
    
    @Column(name = "permissao_id", nullable = false)
    private Long permissaoId;

    @ManyToOne
    @JoinColumn(name = "permissao_id", updatable = false, insertable = false)
    private Permissao permissao;

    public PapelPermissao() {
		super();
	}

	public PapelPermissao(Papel papel, Permissao permissao, LocalDateTime dataDeCriacao, boolean estado) {
		super();
		this.papel = papel;
		this.permissao = permissao;
		this.dataDeCriacao = dataDeCriacao;
		this.estado = estado;
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

	public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
    	if(papel != null) this.setPapelId(papel.getId());
        this.papel = papel;
    }

    public Long getPermissaoId() {
		return permissaoId;
	}

	public void setPermissaoId(Long permissaoId) {
		this.permissaoId = permissaoId;
	}

	public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
    	if(permissao != null) this.setPermissaoId(permissao.getId());
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

