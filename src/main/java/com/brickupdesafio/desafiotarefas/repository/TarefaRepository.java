package com.brickupdesafio.desafiotarefas.repository;

import com.brickupdesafio.desafiotarefas.domain.tarefa.Status;
import com.brickupdesafio.desafiotarefas.domain.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByStatus(Status status);
}
