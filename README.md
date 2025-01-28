# Bookstore BFF

O **bookstore-bff** (Backend For Frontend) é um serviço que atua como intermediário entre o frontend e o microserviço **bookstore-ms**. Ele consome os endpoints do **bookstore-ms** através do Feign Client.

## Requisitos

- Docker e Docker Compose instalados
- Java 21+
- Maven 3.8+

## Configuração e Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/bookstore-bff.git
   cd bookstore-bff
   ```

2. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

## Configuração do Feign Client

O **bookstore-bff** usa o Feign Client para se comunicar com o **bookstore-ms**. Certifique-se de que o **bookstore-ms** está rodando e que a URL está configurada corretamente no `application.properties`:

## Endpoints Disponíveis

A aplicação expõe endpoints que agregam e simplificam chamadas ao **bookstore-ms**. Consulte a documentação Swagger após iniciar a aplicação:

- Swagger UI: `http://localhost:8082/swagger-ui.html`


