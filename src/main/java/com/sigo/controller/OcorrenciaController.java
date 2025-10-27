package com.sigo.controller;


import com.sigo.model.Ocorrencia;
import com.sigo.service.OcorrenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaService ocorrenciaService;

    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @PostMapping
    public Ocorrencia cadastrar(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.criarOcorrencia(ocorrencia);
    }

    @PutMapping("/{id}")
    public Ocorrencia editar(@PathVariable Long id, @RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.editarOcorrencia(id, ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> buscarTodas() {
        return  ocorrenciaService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Ocorrencia buscarOcorrencia(@PathVariable Long id) {
        return ocorrenciaService.buscarPorId(id);
    }
}
