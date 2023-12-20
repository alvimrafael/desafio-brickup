package com.brickupdesafio.desafiotarefas.domain.usuario;

import com.brickupdesafio.desafiotarefas.domain.tarefa.Tarefa;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Map;

import java.util.List;

@Entity(name="usuarios")
@Table(name="usuarios")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String senha;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Tarefa> tarefas;
}
