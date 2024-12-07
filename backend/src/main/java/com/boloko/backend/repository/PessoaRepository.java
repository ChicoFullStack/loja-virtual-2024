package com.boloko.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boloko.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
