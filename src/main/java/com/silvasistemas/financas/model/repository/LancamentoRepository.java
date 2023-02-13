package com.silvasistemas.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silvasistemas.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
