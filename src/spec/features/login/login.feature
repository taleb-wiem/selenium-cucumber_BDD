#language: en
@login @tr
Feature: Je Souhaite Tester La Page Login de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in

@login_validCredentials
Scenario: Je Souhaite Tester la Page Login avec Des Données Valides

And Je saisis une adresse mail 
And Je saisis un mot de passe
And Je clique sur le bouton Login
Then Je me redirige vers la page home "ziedhannachi0@gmail.com"

@login_invalidCredentials
Scenario Outline: Je Souhaite Tester la Page Login avec Des Données Invalides

And Je saisis une adresse mail "<email>" 
And Je saisis un mot de passe "<password>"
And Je clique sur le bouton Login
Then Je visualise le message d'erreur "<error_message>"
Examples:
|email                  |password |error_message                                                  |
|wiemtaleb2212@gmail.com|wiem123  |Login was unsuccessful. Please correct the errors and try again|
