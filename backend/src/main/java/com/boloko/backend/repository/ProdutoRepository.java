package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
