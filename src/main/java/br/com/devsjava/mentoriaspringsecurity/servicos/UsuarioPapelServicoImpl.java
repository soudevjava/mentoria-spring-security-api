package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.UsuarioPapel;
import br.com.devsjava.mentoriaspringsecurity.repositorios.UsuarioPapelRepositorio;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.ServicoBase;

@Service
public class UsuarioPapelServicoImpl extends ServicoBase implements IUsuarioPapelServico {
	
	@Autowired
	private UsuarioPapelRepositorio usuarioPapelRepositorio;

	@Override
	public UsuarioPapel atribuirPapelAoUsuario(UsuarioPapel usuarioPapel) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void retirarPapelDoUsuario(Long papelId, Long usuarioId) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UsuarioPapel> listarPapeisDoUsuario(Long usuarioId) throws NegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
