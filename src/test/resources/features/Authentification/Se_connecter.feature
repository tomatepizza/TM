# language: fr
Fonctionnalité: Se connecter à un compte
  En tant qu'utilisateur
  Je souhaite me connecter à mon compte
  Afin de rejoindre le club de dresseurs pokémon
  
  Scénario: Se connecter à un compte avec des identifiants corrects
    Soit un utilisateur sur la page de connexion au site
    Lorsque l'identifiant est "testiti"
    Et le mot de passe est "Testiti*9"
    Quand l'utilisateur  se connecte à son compte
    Alors l'utilisateur devrait être connecté
    
 	Scénario: Se connecter à un compte avec des identifiants incorrects
    Soit un utilisateur sur la page de connexion au site
    Lorsque l'identifiant est "testiti"
    Et le mot de passe est "Testiti*99"
    Quand l'utilisateur  se connecte à son compte
    Alors l'utilisateur ne devrait pas être connecté
  