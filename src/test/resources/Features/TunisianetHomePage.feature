#Author: your.email@your.domain.com
Feature: Tunisnet Home page

  Scenario: Survoler sur menu et cliquer sur le submenu 
    Given utilisateur est sur la page d acceuil
    When utilisateur survole la souris sur le menu "Stockage" et clique sur le submenu "Disque SSD"
    Then utilisateur est dirigé vers la page de "Disque SSD"
