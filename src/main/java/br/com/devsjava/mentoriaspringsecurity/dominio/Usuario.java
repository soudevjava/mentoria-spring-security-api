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
@Table(name = "usuarios")
public class Usuario extends EntidadeBase {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4730952571443579296L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "nome", nullable = false)
    private String nome;
	
	@Column(name = "email", nullable = false, unique = true)
    private String email;
	
	@Column(name = "senha", nullable = false)
    private String senha;

    public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String email, String senha, LocalDateTime dataDeCriacao, boolean estado) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

