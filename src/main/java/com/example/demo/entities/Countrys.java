package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Countrys {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String image;
}
