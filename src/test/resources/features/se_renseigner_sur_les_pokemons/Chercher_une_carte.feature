# language: fr
Fonctionnalité: Chercher une carte pokémon
  En tant que fan de pokémon
  Je souhaite trouver la description de la carte d'un pokémon
  Afin de savoir utiliser la carte au cours d'une partie

  Scénario: Chercher une carte par son évolution
    Soit un utilisateur sur la page d'encyclopédie des cartes
    Lorsque l'utilisateur cherche la carte qui est l'évolution d'"Hypocéan"
    Alors il devrait voir la carte nommé "Hyporoi" apparaitre
    

	Scénario: Chercher un pokémon par son type
    Soit un utilisateur sur la page d'encyclopédie des cartes
    Lorsque l'utilisateur cherche une carte de type "Dragon"
    Alors il devrait voir la carte du pokémon nommé "Rayquaza" apparaitre
 