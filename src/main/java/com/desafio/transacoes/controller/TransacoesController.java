package com.desafio.transacoes.controller;

import com.desafio.transacoes.model.Transacoes;
import com.desafio.transacoes.service.TransacoesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/transacoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransacoesController {

    @Autowired
    TransacoesServices transacoesServices;

    @GetMapping("/{idConta}")
    public List<Transacoes> obterTransacoes(@PathVariable Long idConta) {
        return transacoesServices.obterTransacoes(idConta);
    }

    @PostMapping
    public ResponseEntity<Transacoes> criarTransacoes(@RequestBody Transacoes transacoes) {
        Transacoes transacao = transacoesServices.criarTransacoes(transacoes);
        return new ResponseEntity<Transacoes>(transacao, HttpStatusCode.valueOf(200));
    }

}
