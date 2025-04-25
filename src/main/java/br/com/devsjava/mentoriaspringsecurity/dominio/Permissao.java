package br.com.devsjava.mentoriaspringsecurity.dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "permissoes")
public class Permissao extends EntidadeBase {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6185503421661291403L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "nome", nullable = false, unique = true)
    private String nome;

    public Permissao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permissao(String nome, LocalDateTime dataDeCriacao, boolean estado) {
		super();
		this.nome = nome;
		this.dataDeCriacao = dataDeCriacao;
		this.estado = estado;
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

