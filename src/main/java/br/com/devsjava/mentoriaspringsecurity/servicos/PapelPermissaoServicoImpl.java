package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.PapelPermissao;
import br.com.devsjava.mentoriaspringsecurity.repositorios.PapelPermissaoRepositorio;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.ServicoBase;

@Service
public class PapelPermissaoServicoImpl extends ServicoBase implements IPapelPermissaoServico {
	
	@Autowired
	private PapelPermissaoRepositorio papelPermissaoRepositorio;

	@Override
	public PapelPermissao atribuirPermissaoAoPapel(PapelPermissao papelPermissao) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PapelPermissao retirarPermissaoDoPapel(Long permissaoId, Long papelId) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PapelPermissao> listarPermissoesDoPapel(Long papelId) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
