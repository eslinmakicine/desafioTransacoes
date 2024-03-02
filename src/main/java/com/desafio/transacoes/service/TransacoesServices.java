package com.desafio.transacoes.service;

import com.desafio.transacoes.model.Transacoes;
import com.desafio.transacoes.repository.TransacoesRepository;
import com.desafio.transacoes.utils.GerarDadosTransacoesMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacoesServices {

    @Autowired
    TransacoesRepository transacoesRepository;

    public List<Transacoes> obterTransacoes(Long idConta) {
        return transacoesRepository.findAll();
    }

    public Transacoes criarTransacoes(Transacoes transacoes) {
        return transacoesRepository.save(transacoes);
    }
}
