package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
