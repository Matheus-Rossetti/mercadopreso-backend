O código está todo comentado, mas segue uma breve explicação:

O código principal fica em 'src/main/java/com.catolica.mercadopreso'

dentro dessa pasta, ou no caso do java, dentro desse package, tem o arquivo principal 'MercadoPresoApplication'

Dentro do package principal tem outros 4, cada um tem um arquivo dentro, sugiro que olhem na seguinte ordem:

1. model
2. repository
3. service
4. controller

Te explicadinho lá o que é cada coisa, qualquer coisa, perguntem no zap.

Aliás, pra rodar o projeto tem que ir em 'main/java/resources/application.properties' e colocar username e password do DB que mandei no zap
não commitei aqui pois esse repo é público e tem um monte de bot que fica procurando login de banco de dados.


Depois de rodar, da pra usar o Postman pra fazer as requisições, já tem alguns produtos de teste então se só
colocar 'localhost:8080/produtos' no navegador, deve devolver alguns. 
