package com.example.demo.resources;

import com.example.demo.entities.Countrys;
import com.example.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/countries")

public class CountrysResource {

    @Autowired
    private CountryService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Countrys> buscarCountrys(@PathVariable Long id){
        return ResponseEntity.ok(service.getCountrys(id));
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarAllCountrys(){
        return ResponseEntity.ok(service.getAllCountrys());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> insertCountrys(@RequestBody Countrys countrys){
        return ResponseEntity.ok(service.insertCountrys(countrys));
    }
}
