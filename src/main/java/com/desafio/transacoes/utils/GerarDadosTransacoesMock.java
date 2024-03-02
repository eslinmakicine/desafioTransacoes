package com.desafio.transacoes.utils;

import com.desafio.transacoes.model.Transacoes;
import com.desafio.transacoes.model.enums.Operacao;
import com.desafio.transacoes.model.enums.Tipo;
import com.desafio.transacoes.repository.TransacoesRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class GerarDadosTransacoesMock {

    @Autowired
    TransacoesRepository transacoesRepository;

    @PostConstruct
    public void gerarDadosTransacoesMock() {
        Transacoes transacao1 = Transacoes.builder()
                .idConta(134L)
                .localDate(LocalDateTime.now().minusMinutes(-12456))
                .valor(101.00)
                .operacao(Operacao.CREDITO)
                .tipo(Tipo.DEPOSITO)
                .build();
        Transacoes transacao2 = Transacoes.builder()
                .idConta(134L)
                .localDate(LocalDateTime.now().minusDays(-4))
                .valor(302.90)
                .operacao(Operacao.DEBITO)
                .tipo(Tipo.BOLETO)
                .build();
        Transacoes transacao3 = Transacoes.builder()
                .idConta(134L)
                .localDate(LocalDateTime.now().minusDays(6))
                .valor(833.15)
                .operacao(Operacao.CREDITO)
                .tipo(Tipo.PIX)
                .build();
        Transacoes transacao4 = Transacoes.builder()
                .idConta(134L)
                .localDate(LocalDateTime.now())
                .valor(876.90)
                .operacao(Operacao.DEBITO)
                .tipo(Tipo.TRANSFERENCIA)
                .build();
        Transacoes transacao5 = Transacoes.builder()
                .idConta(134L)
                .localDate(LocalDateTime.now())
                .valor(952.48)
                .operacao(Operacao.DEBITO)
                .tipo(Tipo.SAQUE)
                .build();
        Transacoes transacao6 = Transacoes.builder()
                .idConta(123L)
                .localDate(LocalDateTime.now())
                .valor(978.24)
                .operacao(Operacao.CREDITO)
                .tipo(Tipo.TRANSFERENCIA)
                .build();
        Transacoes transacao7 = Transacoes.builder()
                .idConta(123L)
                .localDate(LocalDateTime.now())
                .valor(234.85)
                .operacao(Operacao.CREDITO)
                .tipo(Tipo.PIX)
                .build();
        Transacoes transacao8 = Transacoes.builder()
                .idConta(112L)
                .localDate(LocalDateTime.now())
                .valor(2343.23)
                .operacao(Operacao.CREDITO)
                .tipo(Tipo.PIX)
                .build();
        Transacoes transacao9 = Transacoes.builder()
                .idConta(112L)
                .localDate(LocalDateTime.now())
                .valor(434.23)
                .operacao(Operacao.DEBITO)
                .tipo(Tipo.TRANSFERENCIA)
                .build();
        transacoesRepository.save(transacao1);
        transacoesRepository.save(transacao2);
        transacoesRepository.save(transacao3);
        transacoesRepository.save(transacao4);
        transacoesRepository.save(transacao5);
        transacoesRepository.save(transacao6);
        transacoesRepository.save(transacao7);
        transacoesRepository.save(transacao8);
        transacoesRepository.save(transacao9);
    }
}
