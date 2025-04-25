package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import br.com.devsjava.mentoriaspringsecurity.dominio.Usuario;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;

public interface IUsuarioServico {
	
	public Usuario criarUsuario(Usuario usuario) throws NegocioException;
	
	public void atualizarUsuario(Usuario usuario) throws NegocioException;
	
	public void inativarUsuario(Long usuarioId) throws NegocioException;
	
	public void restaurarUsuario(Long usuarioId) throws NegocioException;
	
	public Usuario pesquisarUsuarioPorId(Long usuarioId) throws NegocioException;
	
	public List<Usuario> listarUsuarios() throws NegocioException;

}
