# language: fr
Fonctionnalité: Se connecter à un compte avec un seul identifiant
  En tant qu'utilisateur
  Je souhaite récupérer mon autre identifiant, puis me connecter à mon compte
  Afin de me connecter et rejoindre le club de dresseurs pokémon
  
	Scénario: Se connecter à un compte en ayant oublié son nom utilisateur
    Soit un utilisateur sur la page de connexion au site
    Lorsque qu'il a oublié son nom d'utilisateur
    Et que le nom a l'écran est "testiti"
    Et l'adresse mail "tomatepizza@gmail.com"
    Alors l'utilisateur devrait voir apparaitre son identifiant "testiti"
    
  Scénario: Se connecter à un compte en ayant oublié son mot de passe
    Soit un utilisateur sur la page de connexion au site
    Lorsque qu'il a oublié son mot de passe
    Et que le nom a l'écran est "testiti"
    Et l'adresse mail "tomatepizza@gmail.com"
    Alors l'utilisateur devrait pouvoir réinitialiser son mot de passe