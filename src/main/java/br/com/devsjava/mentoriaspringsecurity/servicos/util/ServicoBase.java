package br.com.devsjava.mentoriaspringsecurity.servicos.util;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.devsjava.mentoriaspringsecurity.dominio.Usuario;
import br.com.devsjava.mentoriaspringsecurity.repositorios.UsuarioRepositorio;
import br.com.devsjava.mentoriaspringsecurity.utils.MessageService;

/**
 * @author Jose Julai Ritsure
 */
@Service
public class ServicoBase {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private MessageService messageService;

	public Usuario getLoggedUser() throws NegocioException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
			UserDetails userDetails = (UserDetails) authentication.getPrincipal();

			return usuarioRepositorio.findByEmail(userDetails.getUsername()).orElseThrow(
					() -> new NegocioException(messageService.getFormattedMessage("user.search.result.email.not.found",
							new String[] { userDetails.getUsername() })));
		}

		throw new NegocioException(messageService.getFormattedMessage("user.logged.not.found", null));
	}

	public Usuario getAdminUser() throws NegocioException {
		try {
			String email = "ritsure.julai.jose@gmail.com";
			return Optional.of(usuarioRepositorio.findByEmail(email).orElseThrow(
					() -> new NegocioException(messageService.getFormattedMessage("user.email.not.found", new String[] {email}))))
					.get();
		} catch (NegocioException e) {
			throw new NegocioException(messageService.getFormattedMessage("user.search.error", null));
		}
	}

	public String generateUuid() {
		return UUID.randomUUID().toString();
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

}
