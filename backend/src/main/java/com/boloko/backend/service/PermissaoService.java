package com.boloko.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boloko.backend.entity.Permissao;
import com.boloko.backend.repository.PermissaoRepository;

@Service
public class PermissaoService {

    @Autowired
    private PermissaoRepository repo;

    public List<Permissao> buscaTodos() {
        return repo.findAll();
    }

    public Permissao inserir(Permissao obj) {
        obj.setDataCriacao(new Date());
        Permissao objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Permissao alterar(Permissao obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Permissao obj = repo.findById(id).get();
        repo.delete(obj);        
    }

}
