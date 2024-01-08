package com.test_technique.modelsisbackend.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
