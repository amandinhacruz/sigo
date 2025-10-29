package com.sigo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ocorrencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<TipoOcorrencia> roles;

    private String viatura;
    private String grupamento;
    private String status;
    private String dataHoraOcorrido;
    private LocalDateTime dataRegistro;
    private String regiao;
    private String descricao;
    private String recursosUtilizados;
    private int numeroVitimas;
    private String enderecoOcorrencia;
    private String situacaoFinal;
    private String nome;
    private String codigoIdentificacao;
    private String cpf;
    private String telefone;

}
