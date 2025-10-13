package com.sigo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Foto {
    @Id
    @GeneratedValue
    private Long id;

    private String caminhoArquivo;
    private String hashImagem;
    private LocalDateTime timestamp;

    @ManyToOne
    private Ocorrencia ocorrencia;
}
