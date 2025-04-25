package br.com.devsjava.mentoriaspringsecurity.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.Usuario;
import br.com.devsjava.mentoriaspringsecurity.repositorios.UsuarioRepositorio;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.NegocioException;
import br.com.devsjava.mentoriaspringsecurity.servicos.util.ServicoBase;
import io.micrometer.common.util.StringUtils;

@Service
public class UsuarioServicoImpl extends ServicoBase implements IUsuarioServico {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario criarUsuario(Usuario usuario) throws NegocioException {
		this.validarUsuario(usuario);
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public void atualizarUsuario(Usuario usuario) throws NegocioException {
		Usuario usuarioExistente = Optional.of(usuarioRepositorio.findById(usuario.getId()).orElseThrow(() -> new NegocioException(""))).get();
		usuario.setEstado(true);
		usuarioRepositorio.save(usuario);

	}

	@Override
	public void inativarUsuario(Long usuarioId) throws NegocioException {
		Usuario usuario = Optional.of(usuarioRepositorio.findById(usuarioId).orElseThrow(() -> new NegocioException(""))).get();
		usuario.setEstado(false);
		usuarioRepositorio.save(usuario);
	}

	@Override
	public void restaurarUsuario(Long usuarioId) throws NegocioException {
		Usuario usuario = Optional.of(usuarioRepositorio.findById(usuarioId).orElseThrow(() -> new NegocioException(""))).get();
		usuario.setEstado(true);
		usuarioRepositorio.save(usuario);
	}

	@Override
	public Usuario pesquisarUsuarioPorId(Long usuarioId) throws NegocioException {
		return Optional.of(usuarioRepositorio.findById(usuarioId).orElseThrow(() -> new NegocioException(""))).get();
	}

	@Override
	public List<Usuario> listarUsuarios() throws NegocioException {
		return usuarioRepositorio.findAll();
	}

	private void validarUsuario(Usuario usuario) {
		if (StringUtils.isBlank(usuario.getNome())) {
			throw new NegocioException("");
		}
		if (StringUtils.isBlank(usuario.getEmail())) {
			throw new NegocioException("");
		}
		if (StringUtils.isBlank(usuario.getSenha())) {
			throw new NegocioException("");
		}
		if (usuario.getDataDeCriacao() == null) {
			throw new NegocioException("");
		}
		if (!usuario.isEstado()) {
			throw new NegocioException("");
		}
	}

}
