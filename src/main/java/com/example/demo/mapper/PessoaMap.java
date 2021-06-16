package com.example.demo.mapper;

import com.example.demo.dto.PessoaDTO;
import com.example.demo.entities.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMap {
    Pessoa toModel(PessoaDTO pessoaDTO);
}
