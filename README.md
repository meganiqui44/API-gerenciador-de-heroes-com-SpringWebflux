
![](livecoding/apirestmarvelbanner.jpeg)

## Stack Utilizada
  * Java8
  * Spring Webflux
  * Spring Data
  * Dynamodb
  * Junit
  * Sl4j
  * Reactor
   
### Slides da professora da Dio (Digital Innovation One): 
- https://speakerdeck.com/kamilahsantos/live-coding-dio-api-de-herois-com-spring-webflux

### Palestra em vídeo: 
- https://www.youtube.com/watch?v=1VllPZYn6RI&t=3257s

### Como Executar Dynamo: 
- Na pasta em que o jar está baixado: java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
- Para listar as tabelas criadas:  aws dynamodb list-tables --endpoint-url http://localhost:8000
- Documentação gerada pela aplicação: swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html
