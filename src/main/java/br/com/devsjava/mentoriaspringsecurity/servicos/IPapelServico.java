package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import br.com.devsjava.mentoriaspringsecurity.dominio.Papel;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;

public interface IPapelServico {
	
	public Papel criarPapel(Papel papel) throws NegocioException;
	
	public void atualizarPapel(Papel papel) throws NegocioException;
	
	public void inactivarPapel(Long papelId) throws NegocioException;
	
	public void restaurarPapel(Long papelId) throws NegocioException;
	
	public Papel pesquisarPapelPorId(Long papelId) throws NegocioException;
	
	public List<Papel> listarPapeis() throws NegocioException;

}
