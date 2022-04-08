Part 2 Mise en oeuvre de l'injection des dépendances:

On teste le même exemple de la partie 1: 

![image](https://user-images.githubusercontent.com/102218192/162334833-c3c94e87-77e0-4b97-b80a-56aa0a521421.png)


Dans cette partie on utilise le Framework Spring :

Version XML :

![image](https://user-images.githubusercontent.com/102218192/162335790-b6b88414-1a63-4d8b-96be-3a7190560226.png)

![image](https://user-images.githubusercontent.com/102218192/162335980-df26b405-3855-43dd-92e7-eac7f1bfb56a.png)

![image](https://user-images.githubusercontent.com/102218192/162336079-cf3b8a2e-f9b2-4f17-a906-a2f7d5c824a8.png)

On fait l'injection via un Constructeur :

![image](https://user-images.githubusercontent.com/102218192/162336742-31b0d266-6a6c-4df0-a274-67ecc92fc4af.png)


Version annotation :

![image](https://user-images.githubusercontent.com/102218192/162336460-8038bf76-026c-4dab-897c-756db46c1907.png)

dans cette partie on teste les commandes de maven :

![image](https://user-images.githubusercontent.com/102218192/162337134-72dacdc4-3ef7-45ce-8556-b7c3454b9020.png)

commande mvn compile:

![image](https://user-images.githubusercontent.com/102218192/162337271-fb80a3c1-80dc-47a9-8932-d680e43b57b1.png)

commande mvn test:

![image](https://user-images.githubusercontent.com/102218192/162337681-5cae155a-49cf-4bc6-aa2c-929f10f38d32.png)

si on change le résultat par exemple le teste ne passe pas :

![image](https://user-images.githubusercontent.com/102218192/162337777-4e7194b7-e423-45fd-8453-779cedcd0463.png)

![image](https://user-images.githubusercontent.com/102218192/162338129-3c956077-a323-4899-a17e-a6822e6189de.png)
![image](https://user-images.githubusercontent.com/102218192/162338149-5e03250d-15aa-49f3-bf63-c272240071a7.png)

commande mvn package:

![image](https://user-images.githubusercontent.com/102218192/162338425-bdd96e18-f9f2-4996-aad3-cf75b8ea5b2c.png)
![image](https://user-images.githubusercontent.com/102218192/162338467-f1d2fee9-1626-4529-934b-a5e7c073d57e.png)

![image](https://user-images.githubusercontent.com/102218192/162338583-3dbe1361-f01d-4f53-9c9c-507da4fbc925.png)

commande mvn install

![image](https://user-images.githubusercontent.com/102218192/162338716-4f754047-e1eb-4c8f-b562-9544e904cd9e.png)
![image](https://user-images.githubusercontent.com/102218192/162338764-63d80e19-5b0a-4d2e-b6ed-721c279cbd1f.png)

commande mvn clean :

![image](https://user-images.githubusercontent.com/102218192/162338829-51a3ef25-d642-4a21-8d44-bc05dcf16c10.png)

On peut faire tous  les commandes avec IntelliJ alors on a pas besoin d'installer maven:

![image](https://user-images.githubusercontent.com/102218192/162339352-0a6c9bef-ca5b-4180-82bd-f8f7e482b16d.png)









