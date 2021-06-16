package com.example.demo.resources;

import com.example.demo.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.PessoaService;

@RestController //Define sua classe com controlador
@RequestMapping(value = "/pessoas")  //definir a URL e qual tipo (POST, PUT,GET)
public class PessoaResource {
    @Autowired
    private PessoaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pessoa> buscarPessoas(@PathVariable Long id){
        return ResponseEntity.ok(service.getPessoa(id));
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarAll(){
        return ResponseEntity.ok(service.getAllPessoa());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> insertPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok(service.insertPessoa(pessoa));
    }
}
