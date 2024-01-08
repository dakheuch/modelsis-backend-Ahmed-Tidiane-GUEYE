package com.test_technique.modelsisbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test_technique.modelsisbackend.entities.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByName(String nom);
}
