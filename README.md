# **API REST Quarkus**

## **Ferramentas Utilizadas para Desenvolvimento**

```
IntelliJ IDEA
DBeaver
Postman
Quarkus  
Java
Docker
MySQL
```

## **Dependências**

O desenvolvimento de código em Java, em geral, usufrui de um significativo conjunto de bibliotecas e _frameworks_. Esta
reutilização é incorporada em um projeto por meio de dependências. Para gerenciar foi utilizado o _Maven_.

```
REST
Hibernate ORM with Panache
JDBC Driver - MySQL
REST Jackson
```

## **Métodos**

Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza um registro do sistema. |
| `DELETE` | Deleta um registro do sistema. |

## **Respostas**

| Status | Descrição                                                          |
|--------|--------------------------------------------------------------------|
| `200`  | Requisição executada com sucesso (success).                        |
| `201`  | Requisição executada com sucesso (success).                        |
| `400`  | Erros de validação ou os campos informados não existem no sistema. |
| `409`  | Conflito.                                                          |
| `405`  | Método não implementado.                                           |

# **Recursos da API**

| Método     | Endpoint                                             |
|------------|------------------------------------------------------|
| `GET`      | /users?{page}&{pageSize}                             |
| `GET`      | /users/{id}                                          |
| `POST`     | /users                                               |
| `PUT`      | /users/{id}                                          |
| `DELETE`   | /users/{id}                                          |

