package com.example.listadetarefas.model;

import java.io.Serializable;

public class Tarefa implements Serializable {

    private Long Id;
    private String nomeTarefa;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}
