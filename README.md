# Explorando Padrões de Projetos na Prática com Java e Spring Boot

## Digital Innovation One: Labs

Este Repositório explora os padrões de projeto Singleton, Strategy e Facade em Java puro e Spring boot


<hr>

Para iniciar este projeto, foi utilizado o [spring initializr](https://start.spring.io/) utilizando as opções:
* Project: Maven Project;
* Language: Java 11;
* Spring Boot: 3.3.2;
* Dependencies: Spring Web, Spring Data JPA, H2 Database e OpenFeign.

Dependência adicionada manualmente no `pom.xml`: [Springdoc OpenAPI UI v2.6.0](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12).

<hr>

Padrões e conceitos apresentados no Lab:
* *Singleton*: Padrão Criacional que permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la;
* *Strategy*: Padrão Comportamental com objetivo de simplificar a variação de algoritmos para a resolução de um mesmo problema;
* *Facade*: Padrão Estrutural que visa prover uma interface que reduza a complexidade nas integrações com subsistemas.

A relação entre Padrões de Projetos com Java e o spring framework pode-se ser percebida em:
* Annotations *@Bean* e *@Autowired* como padrão criacional **Singleton**;
* Annotations *@Service* e *@Repository* como padrão comportamental **Strategy**;
* Annotation *@RestController* como padrão estrutural **Facade**.

<hr>

Swagger: ``http://127.0.0.1:8080/swagger-ui.html``

Exemplo in POST Cliente: 
```JSON
{
  "id": 0,
  "nome": "Geovane Araujo",
  "endereco": {
    "cep": "60866-290",
    "logradouro": "string",
    "complemento": "string",
    "unidade": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```
Get Clientes já retornando endereço pela API via CEP:
```JSON
{
  "id": 0,
  "nome": "Geovane Araujo",
  "endereco": {
    "cep": "60866-290",
    "logradouro": "Avenida Monsenhor Amarílio Rodrigues",
    "complemento": "(Cj São Cristovão)",
    "unidade": "",
    "bairro": "Jangurussu",
    "localidade": "Fortaleza",
    "uf": "CE",
    "ibge": "2304400",
    "gia": "",
    "ddd": "85",
    "siafi": "1389"
  }
}
```

<hr>

Links Interessantes:
* IDE: [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/);
* [jsonschema2pojo.org](https://www.jsonschema2pojo.org);
* [ViaCEP](https://viacep.com.br);

