#Author: your.email@your.domain.com
Feature: Recherche un produit 

  Scenario: Recherche produit et verifier le resultat
    Given utilisateur est sur la page d acceuil
    When utilisateur recherche un produit "Film de protection Nano Glass 9H pour Samsung A12"
    Then utilisateur verifie la resultat de recherche "Film De Protection Nano Glass 9H Pour Samsung A12"
