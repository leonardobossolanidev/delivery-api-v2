package com.leonardobossolani.deliveryapi.controller;

import com.leonardobossolani.deliveryapi.model.Entrega;
import com.leonardobossolani.deliveryapi.service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public List<Entrega> listar() {
        return entregaService.listar();
    }

    @GetMapping("/{id}")
    public Entrega buscarPorId(@PathVariable Long id) {
        return entregaService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Entrega não encontrada"));
    }

    @PostMapping
    public Entrega salvar(@RequestBody Entrega entrega) {
        return entregaService.salvar(entrega);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        entregaService.deletar(id);
    }

    @PutMapping("/{id}/status")
    public Entrega atualizarStatus(@PathVariable Long id, @RequestParam String status) {
        return entregaService.atualizarStatus(id, status);
    }
}
