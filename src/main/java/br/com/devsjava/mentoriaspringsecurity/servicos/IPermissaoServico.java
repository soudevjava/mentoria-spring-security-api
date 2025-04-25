package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import br.com.devsjava.mentoriaspringsecurity.dominio.Permissao;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;

public interface IPermissaoServico {
	
	public Permissao criarPermissao(Permissao permissao) throws NegocioException;
	
	public void atualizarPermissao(Permissao permissao) throws NegocioException;
	
	public void inativarPermissao(Long permissaoId) throws NegocioException;
	
	public void restaurarPermissao(Long permissaoId) throws NegocioException;
	
	public Permissao pesquisarPermissaoPorId(Long permissaoId) throws NegocioException;
	
	public List<Permissao> listarPermissoes() throws NegocioException;

}
