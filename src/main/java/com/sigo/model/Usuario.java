package com.sigo.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

        @Id
        @GeneratedValue
        private Long id;

        private String username;
        private String password;

        @Enumerated(EnumType.STRING)
        private Perfil perfil;
    }


