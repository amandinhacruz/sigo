package com.sigo.controller;

import com.sigo.dto.LoginRequest;
import com.sigo.model.Usuario;
import com.sigo.repository.UsuarioRepository;
import com.sigo.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        return usuarioRepository.findByEmail(request.getEmail())
                .map(usuario -> {
                    if (!passwordEncoder.matches(request.getSenha(), usuario.getSenha())) {
                        return ResponseEntity.status(401).body("Senha inválida");
                    }
                    // ⚡ Passa o objeto Usuario para gerar token com roles
                    String token = jwtUtil.gerarToken(usuario);
                    return ResponseEntity.ok(token);
                })
                .orElse(ResponseEntity.status(404).body("Usuário não encontrado"));
    }

}



