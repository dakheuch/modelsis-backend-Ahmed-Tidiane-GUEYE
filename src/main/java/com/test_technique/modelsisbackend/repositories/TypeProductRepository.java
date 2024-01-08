package com.test_technique.modelsisbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test_technique.modelsisbackend.entities.TypeProduct;

import java.util.Optional;

public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
    Optional<TypeProduct> findByName(String nom);
}
