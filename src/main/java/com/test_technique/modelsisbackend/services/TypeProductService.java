package com.test_technique.modelsisbackend.services;

import com.test_technique.modelsisbackend.entities.TypeProduct;
import com.test_technique.modelsisbackend.exception.TypeProductExistantException;
import com.test_technique.modelsisbackend.repositories.TypeProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeProductService {
    private  final TypeProductRepository typeProductRepository;

    public List<TypeProduct> getAllTypeProduct(){
        return typeProductRepository.findAll();
    }

    public TypeProduct addTypeProduit(TypeProduct typeProduct) {
        typeProductRepository.findByName(typeProduct.getName())
                .ifPresent(t -> {
                    throw new TypeProductExistantException("Le type de produit existe déjà");
                });
        return typeProductRepository.save(typeProduct);
    }
}
