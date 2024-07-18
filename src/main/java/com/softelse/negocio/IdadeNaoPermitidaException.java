package com.softelse.negocio;

public class IdadeNaoPermitidaException extends Exception{

    public static final String MSG_IDADE_INVALIDA = "Idade Invalida";

    public IdadeNaoPermitidaException() {
    }

    public IdadeNaoPermitidaException(String message) {
        super(message);
    }

}
