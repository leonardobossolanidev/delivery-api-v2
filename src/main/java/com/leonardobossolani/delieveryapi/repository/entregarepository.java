package com.leonardobossolani.deliveryapi.repository;

import com.leonardobossolani.deliveryapi.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
