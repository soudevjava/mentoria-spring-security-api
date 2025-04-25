package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import br.com.devsjava.mentoriaspringsecurity.dominio.UsuarioPapel;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;

public interface IUsuarioPapelServico {
	
	public UsuarioPapel atribuirPapelAoUsuario(UsuarioPapel usuarioPapel) throws NegocioException;
	
	public void retirarPapelDoUsuario(Long papelId, Long usuarioId) throws NegocioException;
	
	public List<UsuarioPapel> listarPapeisDoUsuario(Long usuarioId) throws NegocioException;

}
