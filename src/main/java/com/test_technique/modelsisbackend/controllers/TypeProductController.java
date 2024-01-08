package com.test_technique.modelsisbackend.controllers;

import com.test_technique.modelsisbackend.entities.TypeProduct;
import com.test_technique.modelsisbackend.services.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/productType")
public class TypeProductController {
    private final TypeProductService typeProductService;

    @Autowired
    public TypeProductController(TypeProductService typeProductService) {
        this.typeProductService = typeProductService;
    }

    @PostMapping
    public ResponseEntity<TypeProduct> addTypeDeProduit(@Valid  @RequestBody TypeProduct typeDeProduit) {
        TypeProduct nouveauTypeDeProduit = typeProductService.addTypeProduit(typeDeProduit);
        return ResponseEntity.ok(nouveauTypeDeProduit);
    }

    @GetMapping
    public ResponseEntity<List<TypeProduct>> getAllTypesDeProduit() {
        return ResponseEntity.ok(typeProductService.getAllTypeProduct());
    }
}
