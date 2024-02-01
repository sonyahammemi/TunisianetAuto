#Author: your.email@your.domain.com
Feature: Ajout produit

  Scenario: Commander un produit
    Given utilisateur est sur la page du produit
    When utilisateur commande un produit "Disque Dur Interne HIKVISION E100 / 128 Go SSD"
    Then utilisateur verifie la commande "Disque Dur Interne HIKVISION E100 / 128 Go SSD"
