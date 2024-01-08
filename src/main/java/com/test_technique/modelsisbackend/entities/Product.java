package com.test_technique.modelsisbackend.entities;

import java.time.LocalDate;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "type_de_produit_id", nullable = false)
    private TypeProduct typeProduct;
}
