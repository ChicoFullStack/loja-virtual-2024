package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Estado;


public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}
