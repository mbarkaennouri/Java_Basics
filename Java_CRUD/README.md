## Java CRUD Application – Gestion des Personnes avec JDBC & MySQL
Ce projet est une application Java qui permet de gérer une base de données de personnes (ajout, modification, affichage et suppression).
Il utilise JDBC pour la connexion et MySQL comme SGBD.

# Fonctionnalités

➕ Ajouter une personne dans la base
✏️ Modifier les informations d’une personne
📋 Afficher toutes les personnes enregistrées
❌ Supprimer une personne
🔌 Connexion automatique à la base de données MySQL via une classe dédiée

# 📂 Structure du projet

Principale/Principale.java → contient la méthode main et les tests CRUD
Personne/Personne.java → classe représentant une personne avec id, nom, prénom
CRUD/Gestion.java → classe qui gère les opérations CRUD avec la base de données
connexion/MySql_Con.java → classe responsable de la connexion MySQL via JDBC

# ⚙️ Prérequis

Java 8 ou version supérieure
MySQL installé et en cours d’exécution (ici j'ai utilisé XAMPP)
Driver JDBC : mysql-connector-java
Une base de données nommée gestion_personne (à créer avant exécution)

# 🚀 Installation & Exécution

- Cloner le projet :
git clone https://github.com/mbarkaennouri/Java_Basics.git

- Importer le projet dans ton IDE (Eclipse, IntelliJ, NetBeans).

# Créer la base de données dans MySQL :

CREATE DATABASE gestion_personne;
USE gestion_personne;
CREATE TABLE personnes (
    Id INT PRIMARY KEY,
    nom VARCHAR(50),
    prenom VARCHAR(50)
);


Vérifier que la configuration de la connexion dans MySql_Con.java correspond bien à ton environnement :

conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/gestion_personne", "root", ""
);


# Lancer le programme depuis Principale.java.

# 📌 Exemple de sortie
Success
l'id est 1
le nom est Mohamed
le prenom est Fatma

l'id est 2
le nom est Tounsi
le prenom est Ali

l'id est 3
le nom est Salah
le prenom est Sami
