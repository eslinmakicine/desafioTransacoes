package com.desafio.transacoes.model.enums;

public enum Operacao {
    CREDITO(1),
    DEBITO(2);

    private final Integer valor;
    Operacao(int valorOperacao) {
        valor = valorOperacao;
    }
}
