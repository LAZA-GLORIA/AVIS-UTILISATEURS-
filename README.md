# AVIS-UTILISATEURS

# 1 - Spring Initializr - Dependencies : Driver Postgre - Spring data jpa - Spring web - SB Dev tools - Spring Security - Java mail sender - Lombok

# docker DockerCompose : initialise la BDD et l'ihm pour la BDD et el serveur d'emails
# https://hub.docker.com/_/postgres --> figer la version de l'image docker qui est ici 15.3 et de l'adminer pour eviter les mises à jour inattendues lors du déploiement de nouveaux conteneurs.

# rnwood/smtp4dev --> serveur smtp qui permet d'avoir un environnement de developpement en local 
# https://github.com/rnwood/smtp4dev

# Dans src/main/ressources --> docker-compose up -d et docker-compose ps

# Conteneurs docker ok --> configurer bdd