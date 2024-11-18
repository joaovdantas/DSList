# Projeto DSList - Intensivão Java Spring
<p>
 Aplicação back-end JAVA e SpringBoot, desenvolvendo uma API com conexão a banco de dados e conteinerização com Docker, utilizando as melhores praticas Rest e ensinando como subir aplicação em Nuvem.
</p>

## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (21)
- Spring Boot
- Sring Data JPA
- JPA / Hibernate
- Maven
- H2 Database
- Postgres
- Postman
- Docker Compose

## Projeto

  Projeto foi desenvolvido durante o curso *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). 
  O projeto consiste em uma API Rest de Gerenciamento de Entregas de jogos de Diferentes Plataformas.


## O que Aprendemos
![ResumoDoIntensivao](https://github.com/user-attachments/assets/34d28e8e-2fa8-4d69-8938-f4f6bc6cc3e3)




## Diagrama de Classes
![dslist-model](https://github.com/user-attachments/assets/a8074348-9248-42ab-b203-748688f997ff)


## :bookmark_tabs: Documentação da API

#### URL base

```https
  http://localhost:8080/dslist/
```


#### Obter Listagem dos Games Cadastrados

```https
  GET /games
```


#### Buscar Listagem dos Games Cadastrados Pelo Id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter Listagem das Listas de Games Cadastrados

```https
  GET /lists
```


#### Buscar Listagem das Listas de Games Cadastrados Pelo Id da Lista

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma Lista de Game

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |

