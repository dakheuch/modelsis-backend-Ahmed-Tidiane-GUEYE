package com.test_technique.modelsisbackend.services;

import com.test_technique.modelsisbackend.entities.Product;
import com.test_technique.modelsisbackend.entities.TypeProduct;
import com.test_technique.modelsisbackend.exception.ProductExistantException;
import com.test_technique.modelsisbackend.repositories.ProductRepository;
import com.test_technique.modelsisbackend.repositories.TypeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;
    private final TypeProductRepository typeProductRepository;

    @Autowired
    public ProductService(ProductRepository productRepository,TypeProductRepository typeProductRepository) {
        this.productRepository = productRepository;
        this.typeProductRepository=typeProductRepository;
    }


    private void verifierUniciteNomProduit(String nom) {
        Optional<Product> produitExistant = productRepository.findByName(nom);
        if (produitExistant.isPresent()) {
            throw new ProductExistantException("Le nom du produit existe déjà");
        }
    }

    public Product ajouterProduit(Product produit) {
        verifierUniciteNomProduit(produit.getName());
        return productRepository.save(produit);
    }

    public List<Product> listerLesProduits() {
        return productRepository.findAll();
    }

    public Product mettreAJourProduit(Long id, Product produitDetails) {
        Product produit = productRepository.findById(id)
                .orElseThrow(() -> new ProductExistantException("Le produit avec l'ID " + id + " n'existe pas"));

        produit.setName(produitDetails.getName());
        produit.setDate(produitDetails.getDate());

        if (produitDetails.getTypeProduct() != null && produitDetails.getTypeProduct().getId() != null) {
            TypeProduct typeDeProduit = typeProductRepository.findById(produitDetails.getTypeProduct().getId())
                    .orElseThrow(() -> new ProductExistantException("Le type de produit spécifié n'existe pas"));
            produit.setTypeProduct(typeDeProduit);
        }

        return productRepository.save(produit);
    }
}
