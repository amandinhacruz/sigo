package com.sigo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;

        @Column(unique = true)
        private String email;
        private String senha;

        @ElementCollection(fetch = FetchType.EAGER)
        @Enumerated(EnumType.STRING)
        private Set<Perfil> roles;
}



