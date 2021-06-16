package com.example.demo.repositories;


import com.example.demo.entities.Countrys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrysRepository extends JpaRepository<Countrys, Long> {
}
