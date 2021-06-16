package com.example.demo.services;

import com.example.demo.entities.Countrys;
import com.example.demo.repositories.CountrysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountrysRepository repository;

    public Countrys getCountrys(Long id) {
        return repository.findById(id).get();
    }

    public List<Countrys> getAllCountrys() {
        return repository.findAll();
    }

    public Countrys insertCountrys(Countrys countrys) {
        return repository.save(countrys);
    }
}
