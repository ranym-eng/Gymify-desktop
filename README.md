# Gymify Desktop

Système de Gestion de Salle de Sport

Aperçu
Ce projet est une application desktop développée dans le cadre des cours de l'École d'Ingénieurs Esprit pour l'année universitaire 2024-2025. Elle est conçue pour gérer plusieurs salles de sport, permettant aux administrateurs, responsables de salles, entraîneurs et sportifs de gérer diverses opérations telles que la gestion des utilisateurs, des activités, des abonnements, des événements, des cours, des paiements, des avis et des blogs. L'application vise à rationaliser les opérations des salles de sport et à améliorer l'expérience utilisateur grâce à une interface intuitive et réactive.
Fonctionnalités

Panneau d'administration : Gérer les utilisateurs, les salles de sport, les activités, les réclamations et les produits pour toutes les succursales.
Tableau de bord du responsable de salle : Ajouter des abonnements pour chaque salle, des événements et des équipes spécifiques à la salle attribuée.
Interface entraîneur : Organiser et gérer les cours et les planning.
Portail sportif : Consulter les activités, abonnements, événements,cours et produit ,effectuer des paiements, gérer les avis et contribuer aux blogs,participer a une evenement.
Support multi-salles : Gestion centralisée pour plusieurs succursales avec des fonctionnalités spécifiques à chaque site.
Design réactif : Optimisé pour une utilisation sur ordinateurs, tablettes et appareils mobiles.

Pile Technologique
Frontend

fxml: Pour une interface utilisateur dynamique et réactive.
CSS : Pour un style moderne et efficace.
Backend

Java
Xampp: Pour stocker les données des utilisateurs, informations des salles, abonnements, etc.

Autres Outils

JWT (JSON Web Tokens) : Pour une authentification et une autorisation sécurisées.
Stripe : Pour le traitement des paiements en ligne.
Git : Pour le contrôle de version.
GitHub : Pour l'hébergement du dépôt du projet.
Recaptcha: Pour securité
Google Calendar: pour gerer les cours
Meteo: Pour afficher le meteo


Structure du Répertoire
gymify/
├── java/                   
│   ├── controllers/                
│   ├── entities/                   
│   └──services/  
    └──tests/
    └──utils/
    
├── resources/ 
    └──assets/
│   ├── config/  
    └── images/
│   ├── readme-images/                 
│   ├── recommender/                 
│   └── Uploads/
├── pom.xml
├── README.md                  
└── .gitignore                  

Premiers Pas
Prérequis

Java 
Xampp (instance locale)
Git
Compte Stripe pour l'intégration des paiements

Installation

Cloner le dépôt :git clone https://github.com/alouiamani/DevAthletes/


Naviguer dans le répertoire du projet :cd DevAthletes


Installer les dépendances:
maven:reload project


Configurer les variables d'environnement :
Créer un fichier gymifyDataBase
Ajouter les variables suivantes : URL = "jdbc:mysql://localhost:3306/projweb";



Lancement de l'Application

Démarrer l'application:
javafx:run


Utilisation

Administrateur : Connectez-vous pour gérer les utilisateurs, les salles, les réclamations et les produits.
Responsable de salle : Accédez au tableau de bord pour ajouter des abonnements, événements ou équipes pour votre salle.
Entraîneur : Créez et gérez des cours et des plannings.
Sportif : Consulter les activités, abonnements, événements,cours et produit ,effectuer des paiements, gérer les avis et contribuer aux blogs,participer a une evenement.

Étiquettes (Topics)

Application desktop
java
AI
machine learning
Xampp
intégration-paiement


Remerciements
Ce projet a été réalisé sous la direction du corps professoral de l'École d'Ingénieurs Esprit. Un grand merci à nos professeurs  Madame Chaima et Monsieur Moataz pour leur soutien et leurs retours tout au long du développement.




## Presentation

Vous pouvez consulter la presentation complete ici :

[Telecharger la presentation PDF](Gymify-web-desktop-presentation.pdf)

### Slides

![Slide 01](docs/presentation/slide-01.png)
![Slide 02](docs/presentation/slide-02.png)
![Slide 03](docs/presentation/slide-03.png)
![Slide 04](docs/presentation/slide-04.png)
![Slide 05](docs/presentation/slide-05.png)
![Slide 06](docs/presentation/slide-06.png)
![Slide 07](docs/presentation/slide-07.png)
![Slide 08](docs/presentation/slide-08.png)
![Slide 09](docs/presentation/slide-09.png)
![Slide 10](docs/presentation/slide-10.png)
![Slide 11](docs/presentation/slide-11.png)
![Slide 12](docs/presentation/slide-12.png)
![Slide 13](docs/presentation/slide-13.png)
![Slide 14](docs/presentation/slide-14.png)
![Slide 15](docs/presentation/slide-15.png)
![Slide 16](docs/presentation/slide-16.png)
![Slide 17](docs/presentation/slide-17.png)
![Slide 18](docs/presentation/slide-18.png)
![Slide 19](docs/presentation/slide-19.png)
![Slide 20](docs/presentation/slide-20.png)
![Slide 21](docs/presentation/slide-21.png)
![Slide 22](docs/presentation/slide-22.png)
![Slide 23](docs/presentation/slide-23.png)
![Slide 24](docs/presentation/slide-24.png)
![Slide 25](docs/presentation/slide-25.png)
![Slide 26](docs/presentation/slide-26.png)
![Slide 27](docs/presentation/slide-27.png)
![Slide 28](docs/presentation/slide-28.png)
![Slide 29](docs/presentation/slide-29.png)
![Slide 30](docs/presentation/slide-30.png)
![Slide 31](docs/presentation/slide-31.png)
![Slide 32](docs/presentation/slide-32.png)
![Slide 33](docs/presentation/slide-33.png)
![Slide 34](docs/presentation/slide-34.png)
![Slide 35](docs/presentation/slide-35.png)
![Slide 36](docs/presentation/slide-36.png)
![Slide 37](docs/presentation/slide-37.png)
![Slide 38](docs/presentation/slide-38.png)
![Slide 39](docs/presentation/slide-39.png)
![Slide 40](docs/presentation/slide-40.png)
![Slide 41](docs/presentation/slide-41.png)
![Slide 42](docs/presentation/slide-42.png)
![Slide 43](docs/presentation/slide-43.png)
![Slide 44](docs/presentation/slide-44.png)
![Slide 45](docs/presentation/slide-45.png)
![Slide 46](docs/presentation/slide-46.png)
![Slide 47](docs/presentation/slide-47.png)
![Slide 48](docs/presentation/slide-48.png)
![Slide 49](docs/presentation/slide-49.png)
![Slide 50](docs/presentation/slide-50.png)
![Slide 51](docs/presentation/slide-51.png)
![Slide 52](docs/presentation/slide-52.png)


