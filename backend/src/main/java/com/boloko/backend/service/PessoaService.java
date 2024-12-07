package com.boloko.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boloko.backend.entity.Pessoa;
import com.boloko.backend.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repo;

    public List<Pessoa> buscaTodos() {
        return repo.findAll();
    }

    public Pessoa inserir(Pessoa obj) {
        obj.setDataCriacao(new Date());
        Pessoa objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Pessoa alterar(Pessoa obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Pessoa obj = repo.findById(id).get();
        repo.delete(obj);        
    }

}
