package com.example.demo.services;

import com.example.demo.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa getPessoa(Long id) {
        return repository.findById(id).get();
    }

    public List<Pessoa> getAllPessoa() {
        return repository.findAll();
    }

    public Pessoa insertPessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }
}
