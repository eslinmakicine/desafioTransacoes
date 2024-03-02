package com.desafio.transacoes.repository;

import com.desafio.transacoes.model.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {
}
