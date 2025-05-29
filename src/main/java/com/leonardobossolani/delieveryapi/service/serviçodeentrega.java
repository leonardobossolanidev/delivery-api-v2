package com.leonardobossolani.deliveryapi.service;

import com.leonardobossolani.deliveryapi.model.Entrega;
import com.leonardobossolani.deliveryapi.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> listar() {
        return entregaRepository.findAll();
    }

    public Optional<Entrega> buscarPorId(Long id) {
        return entregaRepository.findById(id);
    }

    public Entrega salvar(Entrega entrega) {
        entrega.setDataPedido(LocalDateTime.now());
        entrega.setStatus("PENDENTE");
        return entregaRepository.save(entrega);
    }

    public void deletar(Long id) {
        entregaRepository.deleteById(id);
    }

    public Entrega atualizarStatus(Long id, String status) {
        Entrega entrega = entregaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entrega não encontrada"));
        entrega.setStatus(status);
        return entregaRepository.save(entrega);
    }
}
