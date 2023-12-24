"# OrderCraft" 

Description du Projet
Ce projet Java JEE est une application de gestion des clients, des produits et des commandes. Il suit une architecture MVC (Modèle-Vue-Contrôleur) et utilise des servlets pour la logique côté serveur.

Structure du Projet
Le code source est organisé comme suit :

/src
/main
/java
/dao
ClientDaoImplimentation: Implémentation de la DAO pour les clients.
CommandeDaoImplimentation: Implémentation de la DAO pour les commandes.
CommandeProduitDaoIplementation : Implémentation de la DAO pour les produits des commandes.
ProduitDaoImplimentation: Implémentation de la DAO pour les produits.
IClientDao: Interface pour la DAO des clients.
IProduitDao: Interface pour la DAO des produits.
ICommandeDao: Interface pour la DAO des commandes.
SingletonConnection: Singleton pour la connexion à la base de données.
/model
Client: Classe modèle pour les clients.
Commande: Classe modèle pour les commandes.
Produit: Classe modèle pour les produits.
CommandeProduit: Classe modèle pour la relation entre commandes et produits.
/servlets
ProduitControleurServlet: Servlet pour le contrôle des produits.
LoginControleurServlet: Servlet pour le contrôle de la connexion.
CommandeControleurServlet: Servlet pour le contrôle des commandes.
CommandeProduitControllerServlet : Servlet pour le contrôle des CommandeProduit
/webapp
/Produit
produit.jsp: Vue pour afficher les détails des produits.
ajouterproduit.jsp: Vue pour ajouter un nouveau produit.
updateproduit.jsp: Vue pour mettre à jour les informations d'un produit.
rechercherproduit.jsp: Vue pour rechercher des produits.
/Commande
commande.jsp: Vue pour afficher les détails des commandes.
ajouterCommande.jsp: Vue pour ajouter une nouvelle commande.
updateCommande.jsp: Vue pour mettre à jour les informations d'une commande.
rechercherCommande.jsp: Vue pour rechercher des commandes.
/Client
client.jsp: Vue pour afficher les détails des clients.
ajouterClient.jsp: Vue pour ajouter un nouveau client.
updateClient.jsp: Vue pour mettre à jour les informations d'un client.
rechercherClient.jsp: Vue pour rechercher des clients.
dashboard.jsp: Vue du tableau de bord principal.
login.jsp: Vue de la page de connexion.
header.jsp: Vue de l'en-tête commune.
notFound.jsp: Vue pour afficher une page non trouvée.
