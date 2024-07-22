# Spring Boot Boilerplate

*Spring Boot Boilerplate* é um **kit inicial** para começar com o desenvolvimento em Spring Boot, usando uma estrutura
DDD (Domain-Driven Design).
Este é um projeto simples e prático, servindo para iniciar rapidamente o desenvolvimento com um projeto pronto para uso.

## Tecnologias

Este projeto usa as seguintes dependências principais:

- [Java](https://docs.oracle.com/en/java/javase/22/) (v22)
- [Spring Boot](https://spring.io/projects/spring-boot) (v3.3.2)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Maven](https://maven.apache.org/) (v4.0.0)
- [Mapstruct](https://mapstruct.org/) (v1.5.5.Final)
- [Swagger](https://swagger.io/) (v3.0.0)
- [PostgreSQL](https://www.postgresql.org/)
- [Docker](https://docs.docker.com/)
- [Docker compose](https://docs.docker.com/compose/) (v3.5)

## Estrutura do Projeto

A estrutura do projeto segue o padrão DDD com as seguintes pastas:

- **application**: Contém a lógica de aplicação, incluindo serviços, DTOs e exceções.
- **domain**: Contém as entidades do domínio e as interfaces dos repositórios.
- **infrastructure**: Contém as implementações dos repositórios e mapeadores.
- **presentation**: Contém os controladores (endpoints REST).

## Configuração

1. **Clone o repositório**:
    ```bash
    git clone <URL do repositório>
    cd srv-springboot-boilerplate
    ```

2. **Compilar o projeto**:
    ```bash
    ./mvnw clean install
    ```

3. **Executar o projeto**:
    ```bash
    ./mvnw spring-boot:run
    ```

## Endpoints

### DummyController

- **GET /api/dummies**: Retorna todos os dummies.
- **GET /api/dummies/{id}**: Retorna um dummy pelo ID.
- **POST /api/dummies**: Cria um novo dummy.
    - Exemplo de payload:
      ```json
      {
          "name": "Sample Dummy"
      }
      ```
- **PUT /api/dummies/{id}**: Atualiza um dummy pelo ID.
- **DELETE /api/dummies/{id}**: Deleta um dummy pelo ID.

## Exceções

### ResourceNotFoundException

Exceção personalizada lançada quando um recurso não é encontrado.

## Mapeamento de Entidades

### DummyMapper

Usa MapStruct para mapear entre a entidade `Dummy` e o DTO `DummyDto`.

## Contato

Para mais informações, entre em contato comigo [Edson Fernandes de Sousa](mailto:edsonf.sousa0@gmail.com).