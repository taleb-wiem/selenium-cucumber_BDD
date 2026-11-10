@newsletter @tr
Feature: Je Souhaite Tester La Button Subscribe de l'application Web Demo Shop
Background:


Given Je me connecte sur le site Web Demo Shop

  @newsletter_valid
  Scenario: Je souhaite tester le bouton Subscribe avec une adresse email valide
    When Je saisis une adresse email valide
    And Je clique sur le bouton Subscribe
    Then Je vérifie que mon inscription à la newsletter est confirmée
