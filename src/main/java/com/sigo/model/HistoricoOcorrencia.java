package com.sigo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_ocorrencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoricoOcorrencia {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDateTime data;
        private String acao;
        private String usuario; // nome ou ID de quem fez a ação

        @ManyToOne
        @JoinColumn(name = "ocorrencia_id")
        private Ocorrencia ocorrencia;


}
