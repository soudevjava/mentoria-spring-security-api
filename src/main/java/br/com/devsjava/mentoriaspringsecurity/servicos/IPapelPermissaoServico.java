package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;

import br.com.devsjava.mentoriaspringsecurity.dominio.PapelPermissao;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;

public interface IPapelPermissaoServico {
	
	public PapelPermissao atribuirPermissaoAoPapel(PapelPermissao papelPermissao) throws NegocioException;
	
	public PapelPermissao retirarPermissaoDoPapel(Long permissaoId, Long papelId) throws NegocioException;
	
	public List<PapelPermissao> listarPermissoesDoPapel(Long papelId) throws NegocioException;

}
