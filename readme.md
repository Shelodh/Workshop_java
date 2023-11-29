# Workshop Java

Bienvenue dans cet atelier Java ! Ce guide rapide vous aidera à compiler et à exécuter vos programmes Java, ainsi qu'à créer et exécuter des fichiers JAR. Suivez les étapes ci-dessous.

## Compilation et exécution du code source Java

Pour tester votre code source Java, suivez ces étapes simples :

```bash
javac [votre_programme].java

# Exécution du programme
java [nom_du_build]  # Pour effectuer des tests (sans l'extension .class)
```

### Pour le .jar

```bash
javac *.java

jar cfm Core.jar Manifest *.class

java -jar Core.jar
```