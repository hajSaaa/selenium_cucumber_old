@catalog
Feature: Je souhaite vérifier le menu catalog
  En tant que utilisateur je souhaite vérifier le menu catalog

  Background: 
    Given Je me connecte sur l application nopeCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton LOG IN
    And Je clique sur le menu catalog

  @catalague-products-valid
  Scenario: Je souhaite faire une recherche de produit
    When Je clique sur le menu Products
    And Je saisis le produit "Asus"
    And Je clique sur le bouton Search
    Then Le resultat de recherche est OK

  @catalague-products-invalid
  Scenario: Je souhaite vérifier le menu products
    When Je clique sur le menu Products
    And Je saisis le produit "test"
    And Je clique sur le bouton Search
    Then Le resultat de recherche est KO

  @catalague-new-categorie
  Scenario: Je souhaite ajouter une nouvelle catégorie
    #When Je clique sur le menu Products
    When Je clique sur le menu Categories
    And Je clique sur le bouton Add new
    And Je renseigne le champ Name "Nouvelle catégorie"
    And Je renseigne le champ Description "This is a description for on new product" "Description_ifr"
    And Je clique sur la liste déroulante de Parent category
    And Je clique sur Upload a file "C:\Users\33634\Pictures\Screenshots\Capture d'écran 2023-11-05 125454.png"
    And Je verifie que le fichier a bien ete charge
    And Je clique sur le bouton Save
    Then Je verifie que la nouvelle categorie a ete ajoutee "The new category has been added successfully."
