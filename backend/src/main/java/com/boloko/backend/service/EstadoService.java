package com.boloko.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boloko.backend.entity.Estado;
import com.boloko.backend.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    public List<Estado> buscaTodos() {
        return repo.findAll();
    }

    public Estado inserir(Estado obj) {
        obj.setDataCriacao(new Date());
        Estado objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Estado alterar(Estado obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Estado obj = repo.findById(id).get();
        repo.delete(obj);        
    }

}
