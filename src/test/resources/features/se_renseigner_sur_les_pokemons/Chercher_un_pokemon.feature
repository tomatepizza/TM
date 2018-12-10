# language: fr
Fonctionnalité: Chercher un pokémon
  En tant que fan de pokémon
  Je souhaite trouver la fiche de description d'un pokémon
  Afin de mieux connaitre le Pokémon

  Scénario: Chercher un pokémon par son numéro
    Soit un utilisateur sur la page du Pokédex
    Lorsque l'utilisateur cherche le pokémon numéro "38"
    Alors il devrait voir le pokémon nommé "Feunard" apparaitre
    

	Scénario: Chercher un pokémon par son nom
    Soit un utilisateur sur la page du Pokédex
    Lorsque l'utilisateur cherche le pokémon nommé "Feuforêve"
    Alors il devrait voir le pokémon de numéro "200" apparaitre
    