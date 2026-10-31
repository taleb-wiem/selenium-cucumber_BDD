#language: en
@logout @tr
Feature: Je Souhaite fermer l'application Web Demo Shop
Given Je suis connecté sur le site Web Demo Shop
When Je clique sur le bouton Logout
And Je saisis une adresse mail 
Then Je me redirige vers la page de connexion
 And la session utilisateur est fermée
 And le bouton Login est affiché