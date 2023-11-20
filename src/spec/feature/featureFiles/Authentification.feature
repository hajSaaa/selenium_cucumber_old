@authentification @regression
Feature: Je souhaite vérifier la page de connexion
  En tant que utilisateur je souhaite vérifier la page de connexion

  @authenfication-valid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopeCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton LOG IN
    Then Je me redirige vers la page home "Dashboard"

  @authenfication-invalid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopeCommerce
    When Je saisis l email "dmin@yourstore.com"
    And Je saisis le password "dmin"
    And Je clique sur le bouton LOG IN
    Then Je verifie le message d'erreur "Login was unsuccessful. Please correct the errors and try again. No customer account found"

  @logout
  Scenario: Je souhaite me deconnecter
    Given Je me connecte sur l application nopeCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton LOG IN
    When Je clique sur le bouton Logout
