package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
