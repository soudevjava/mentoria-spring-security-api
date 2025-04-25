package br.com.devsjava.mentoriaspringsecurity.servicos.util;

public class NegocioException extends RuntimeException {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1717075312754212125L;
	
	public NegocioException(String message) {
        super(message);
    }

}
