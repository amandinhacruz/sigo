package com.sigo.service;


import com.sigo.model.Ocorrencia;
import com.sigo.repository.OcorrenciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OcorrenciaService {

    private final OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia criarOcorrencia (Ocorrencia ocorrencia) {
        ocorrencia.setDataRegistro(LocalDateTime.now());
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia editarOcorrencia (Long id, Ocorrencia dadosAtualizados) {
        Optional<Ocorrencia> optional = ocorrenciaRepository.findById(id);

        if(optional.isPresent()) {
            Ocorrencia ocorrencia = optional.get();
            ocorrencia.setRoles(dadosAtualizados.getRoles());
            ocorrencia.setViatura(dadosAtualizados.getViatura());
            ocorrencia.setGrupamento(dadosAtualizados.getGrupamento());
            ocorrencia.setStatus(dadosAtualizados.getStatus());
            ocorrencia.setRegiao(dadosAtualizados.getRegiao());
            ocorrencia.setDescricao(dadosAtualizados.getDescricao());
            ocorrencia.setRecursosUtilizados(dadosAtualizados.getRecursosUtilizados());
            ocorrencia.setNumeroVitimas(dadosAtualizados.getNumeroVitimas());
            ocorrencia.setEnderecoOcorrencia(dadosAtualizados.getEnderecoOcorrencia());
            ocorrencia.setSituacaoFinal(dadosAtualizados.getSituacaoFinal());
            ocorrencia.setNome(dadosAtualizados.getNome());
            ocorrencia.setCodigoIdentificacao(dadosAtualizados.getCodigoIdentificacao());
            ocorrencia.setCpf(dadosAtualizados.getCpf());
            ocorrencia.setTelefone(dadosAtualizados.getTelefone());

            return  ocorrenciaRepository.save(ocorrencia);
        } else  {
            throw  new RuntimeException("Ocorrência não encontrada com id: " + id);
        }
    }

    public  Ocorrencia buscarPorId(Long id) {
        return ocorrenciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ocorrência não encontrad com id: " + id));
    }

    public List<Ocorrencia> buscarTodas() {
        return ocorrenciaRepository.findAll();
    }


}
