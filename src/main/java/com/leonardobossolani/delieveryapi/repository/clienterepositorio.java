package com.leonardobossolani.deliveryapi.repository;

import com.leonardobossolani.deliveryapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
