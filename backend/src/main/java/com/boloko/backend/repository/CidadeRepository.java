package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
