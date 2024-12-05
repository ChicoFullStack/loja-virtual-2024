package com.boloko.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boloko.backend.entity.Cidade;
import com.boloko.backend.repository.CidadeRepository;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repo;

    public List<Cidade> buscaTodos() {
        return repo.findAll();
    }

    public Cidade inserir(Cidade obj) {
        obj.setDataCriacao(new Date());
        Cidade objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Cidade alterar(Cidade obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Cidade obj = repo.findById(id).get();
        repo.delete(obj);        
    }

}
