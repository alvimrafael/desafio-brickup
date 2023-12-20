package com.brickupdesafio.desafiotarefas.domain.tarefa;

import com.brickupdesafio.desafiotarefas.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name="tarefa")
@Table(name="tarefa")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataConclusao;
    private String status;

    private String foto;

    @ManyToOne
    private Usuario usuario;
}
