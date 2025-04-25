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
@Table(name = "usuario_papeis")
public class UsuarioPapel extends EntidadeBase {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9092624298205183261L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "usuario_id", nullable = false)
	private Long usuarioId;

    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private Usuario usuario;
    
    @Column(name = "papel_id", nullable = false)
    private Long papelId;

    @ManyToOne
    @JoinColumn(name = "papel_id", insertable = false, updatable = false)
    private Papel papel;

    public UsuarioPapel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioPapel(Usuario usuario, Papel papel, LocalDateTime dataDeCriacao, boolean estado) {
		super();
		this.usuario = usuario;
		this.papel = papel;
		this.dataDeCriacao = dataDeCriacao;
		this.estado = estado;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
    	if(usuario != null) this.setUsuarioId(usuario.getId());
        this.usuario = usuario;
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

