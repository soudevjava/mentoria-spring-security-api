package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.Papel;
import br.com.devsjava.mentoriaspringsecurity.repositorios.PapelRepositorio;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.ServicoBase;

@Service
public class PapelServicoImpl extends ServicoBase implements IPapelServico {
	
	@Autowired
	private PapelRepositorio papelRepositorio;

	@Override
	public Papel criarPapel(Papel papel) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarPapel(Papel papel) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inactivarPapel(Long papelId) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurarPapel(Long papelId) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Papel pesquisarPapelPorId(Long papelId) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Papel> listarPapeis() throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
