package com.sigo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ocorrencia {

    @Id
    @GeneratedValue
    private Long id;

    private String tipo;
    private LocalDateTime dataHora;
    private String viatura;
    private String equipe;
    private String descricao;

    private Double latitude;
    private Double longitude;
    private Double precisaoGPS;
    private LocalDateTime timestampGPS;

    private boolean sincronizada = false;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "ocorrencia", cascade = CascadeType.ALL)
    private List<Foto> fotos;

    @OneToMany(mappedBy = "ocorrencia", cascade = CascadeType.ALL)
    private List<Assinatura> assinaturas;
}
