package com.test_technique.modelsisbackend.controllers;

import com.test_technique.modelsisbackend.entities.Product;
import com.test_technique.modelsisbackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> ajouterProduit(@RequestBody Product product) {
        Product nouveauProduit = productService.ajouterProduit(product);
        return ResponseEntity.ok(nouveauProduit);
    }

    @GetMapping
    public ResponseEntity<List<Product>> listerLesProduits() {
        return ResponseEntity.ok(productService.listerLesProduits());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> mettreAJourProduit(@PathVariable Long id, @RequestBody Product produitDetails) {
        Product produitMisAJour = productService.mettreAJourProduit(id, produitDetails);
        return ResponseEntity.ok(produitMisAJour);
    }
}
