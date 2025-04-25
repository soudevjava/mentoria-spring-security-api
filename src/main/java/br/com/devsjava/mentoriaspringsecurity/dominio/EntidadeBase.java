package br.com.devsjava.mentoriaspringsecurity.dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;

public class EntidadeBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6542704963467550669L;
	
	@Column(name = "usuario_criador_id", nullable = false)
	private Long usuarioCriador;
	
	@Column(name = "data_de_criacao", nullable = false)
    private LocalDateTime dataDeCriacao;
	
	@Column(name = "usuario_atualizador_id")
	private Long usuarioAtualizador;
	
	@Column(name = "data_de_atualizacao")
    private LocalDateTime dataDeAtualizacao;

    @Column(name = "estado", nullable = false)
    private boolean estado;

}
