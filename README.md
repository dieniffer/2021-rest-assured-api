
## Backlog
* [Itens Passiveis de Melhorias]: corrigir a pipeline, melorar o Page Objects


## Descrição
Objetivo desse projeto, é Automatizar os testes funcionais da api https://jsonplaceholder.typicode.com/posts/

## Pré-requisito

- [JDK versão 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Intellij](https://www.jetbrains.com/idea/download/#section=windows)
- [Git Bash](https://git-scm.com/downloads)
- [Maven](https://maven.apache.org/download.cgi)

## Como Baixar
- Criar uma pasta local no computador.

Exemplo:
````
Diretório C: para baixar os arquivos do projeto
````
- Acessar o git Bash, ir até a pasta criada.
- Realizar o clone do projeto https://github.com/dieniffer/2021-rest-assured-api.git usando o comando Git Clone e a URL
- Garantir que as dependências tenham sido baixadas.


## Como Rodar

### Localmente
- Abrir o Intellij, ir em **File -> Open projeto.**

## Padrões
- Para cada página terá um PageObjects com seus respectivos métodos criados.
- Nomes das classes e métodos escritos em português.

# Classes
1. Nome das classes Deve seguir o padrão [CamelCase](https://google.github.io/styleguide/javaguide.html#s5.2.2-class-names).
2. As classes do pacote PageObject, **devem** conter ao final do seu nome a palavra **Page**.
   [PageObjects](https://github.com/SeleniumHQ/selenium/wiki/PageObjects)

- Exemplo: **HomePage.java**

## Padrões
Exemplos:
````
public class DadosBasicosPage{}
public class SolucoesFinanceirasPage{}
```` 
As classes do pacote testecases, **devem** conter ao final do seu nome a palavra **Test**.  
Exemplos:
  ````
 public class DadosBasicosTest{}
 public class SolucoesFinanceirasTest{}
 ```` 

# Dúvidas
Procurar (dienitavares@gmail.com )


