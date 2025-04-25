package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.Permissao;
import br.com.devsjava.mentoriaspringsecurity.repositorios.PermissaoRepositorio;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.ServicoBase;

@Service
public class PermissaoServicoImpl extends ServicoBase implements IPermissaoServico {
	
	@Autowired
	private PermissaoRepositorio permissaoRepositorio;

	@Override
	public Permissao criarPermissao(Permissao permissao) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarPermissao(Permissao permissao) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inativarPermissao(Long permissaoId) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurarPermissao(Long permissaoId) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Permissao pesquisarPermissaoPorId(Long permissaoId) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permissao> listarPermissoes() throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
