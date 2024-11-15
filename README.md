# Projeto DSList - Intensivão Java Spring

## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (21)
- Spring Boot
- JPA / Hibernate
- Maven

## Projeto

  Projeto foi desenvolvido durante o curso *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). O projeto consiste em uma Api Rest de Gerenciamento de Entregas

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

