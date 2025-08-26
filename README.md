# Itau-the-cat-api
The Cat API - Teste Técnico 🐱  Este projeto foi desenvolvido como parte de um teste técnico, com o objetivo de consumir dados da The Cat API  e disponibilizar informações através de APIs REST criadas em Java com Spring Framework.


# Arquitetura
Em Seguida temos a arquitetura da aplicação com MongoDB e Java SpringBootA seguir, apresentamos a arquitetura da aplicação desenvolvida utilizando Java Spring Boot como framework backend e MongoDB como banco de dados NoSQL. Essa combinação permite construir aplicações escaláveis, flexíveis e de alto desempenho, aproveitando o modelo orientado a documentos do MongoDB e a estrutura modular do Spring Boot.

<img width="1455" height="602" alt="image" src="https://github.com/user-attachments/assets/c44f4b17-1e25-4f00-81d9-00918e549828" />

# Instruções de Execução do Projeto

Para executar o projeto, basta clonar o repositório em sua máquina.

Requisitos:

- Java 17.0.14 instalado

- Maven 3.9.11 instalado

Como Executar:

- Abra o Prompt de Comando ou terminal na pasta onde o projeto foi clonado.

- Execute o comando:
```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```bash
http://localhost:8080
```

# Testes da API

Após iniciar o projeto, os endpoints da aplicação estarão prontos para testes. Você pode usar o Postman ou qualquer outra ferramenta de sua preferência.

Lista de Endpoints:

```bash
Listar todas as raças de gatos

GET http://localhost:8080/breeds

```


Listar informações de uma raça específica:

```bash
GET http://localhost:8080/breed?breed=Abyssinian
```


Listar raças por temperamento:

```bash
GET http://localhost:8080/breedTemperament?breed=American Shorthair&temperament=Active,Curious,Easy Going,Playful,Calm
```


Listar raças por origem
```bash
GET http://localhost:8080/breedOrigin?breed=Abyssinian&origin=Egypt
````

Dados gerais da base de gatos:
```bash
GET http://localhost:8080/cats
```

Exemplo de demonstração
<img width="1356" height="772" alt="image" src="https://github.com/user-attachments/assets/438109c6-815a-45c2-bc7c-9b6bcb3a20e4" />

# Test pelo MVN

- Abra o Prompt de Comando ou terminal na pasta onde o projeto foi clonado.

- Execute o comando:
```bash
mvn test
```
exemplo de demonstração

<img width="956" height="327" alt="image" src="https://github.com/user-attachments/assets/54e8a240-e4c0-4271-8179-e5b41c0ca609" />





