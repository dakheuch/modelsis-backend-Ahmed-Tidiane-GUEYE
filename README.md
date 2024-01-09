# Gestion des Produits et Types de Produits

## Introduction

Ce projet est une application de gestion de produits conçue pour simplifier le processus de suivi et de gestion des produits et de leurs types associés. L'application offre des fonctionnalités pour l'ajout, la modification et la consultation des produits, ainsi que pour l'ajout de types de produits. Elle est construite en utilisant des technologies modernes de développement backend, offrant une interface API RESTful

## Fonctionnalités Principales

- **Gestion des Produits**  :
- Ajouter un Produit : Permet d'introduire de nouveaux produits dans le système.
- Lister les Produits : Fournit la capacité de consulter tous les produits existants.
- Modifier un Produit : Offre la possibilité de mettre à jour les informations des produits existants.
- **Gestion des Types de Produits** :
- Ajouter un Type de Produit : Permet d'ajouter de nouveaux types de produits.

## Stack Technologique

- **Spring Boot** : Pour le développement rapide d'applications.
- **Spring Data JPA** : Pour l'interaction avec la base de données.
- **Spring REST** : Pour construire des services RESTful.
- **Java 11** : Langage de programmation utilisé.
- **Lombok** : Pour réduire le boilerplate code.
- **Base de données** : PostgreSQL 14


## Comment Exécuter

Pour lancer ce projet, suivez les étapes ci-dessous :

### Prérequis

Assurez-vous d'avoir les éléments suivants installés :
- Java 11
- Maven 
- Votre base de données PostgreSQL

### Étapes pour Exécuter le Projet

1. **Clonez le Répertoire Git** :
   ```shell
   git clone https://github.com/dakheuch/modelsis-backend-Ahmed-Tidiane-GUEYE.git
   cd modelsis-backend-Ahmed-Tidiane-GUEYE
   
2. **Configurez la Base de Données** :
- Assurez-vous que votre serveur de base de données est en cours d'exécution.
- Créez une base de données pour l'application.
- Mettez à jour le fichier application.properties ou application.yml avec vos paramètres de base de données.

3. **Construire le projet executant la commande** :
- mvn clean install

4. **Executer l'application** :
- mvn spring-boot:run
5. **Test API** :
- L'application devrait maintenant être en cours d'exécution sur localhost avec le port configuré (8080).
- 
- Endpoint :
  - Opération GET: /api/product => liste des produits
  - Opération POST: /api/product => ajouter un produit
  - Opération POST: /api/productType => ajouter un type de produit
  - Opération PUT: /api/product/{id} => mettre à jour un produit


