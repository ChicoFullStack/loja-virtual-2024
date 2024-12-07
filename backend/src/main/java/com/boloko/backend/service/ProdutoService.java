package com.boloko.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boloko.backend.entity.Produto;
import com.boloko.backend.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public List<Produto> buscaTodos() {
        return repo.findAll();
    }

    public Produto inserir(Produto obj) {
        obj.setDataCriacao(new Date());
        Produto objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Produto alterar(Produto obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Produto obj = repo.findById(id).get();
        repo.delete(obj);        
    }

}