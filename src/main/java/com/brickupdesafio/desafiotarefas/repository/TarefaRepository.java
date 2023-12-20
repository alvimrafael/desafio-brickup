package com.brickupdesafio.desafiotarefas.repository;

import com.brickupdesafio.desafiotarefas.domain.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
