# Desafio CTC TECH - KComplementary pairs


## Sobre o projeto

Projeto desenvolvido para avaliação de conhecimento da empresa CTC TECH.   
Consiste em informar quantos k complementary foram encontrados no array informado.   

O algoritmo desenvolvido tem a complexidade de O(n^2), pois os dados são processados em pares,
com as duas iterações do "for".
fonte da explicação do O(n^2): https://dev.to/danielle8farias/complexidade-de-algoritmos-notacao-big-o-26al

## Pré-requisitos para executar o projeto:

* Java: 11 ou superior.
* Maven: 3.8.1
* JUnit 5.

## Para executar a aplicação:

No diretório do projeto execute o seguinte comando no terminal:  
`mvn clean install`   
`
Abra o projeto em uma IDE.      
execute a classe "KComplementaryMain" do pacote com.ricardofarias.ctc.main   `


## EXEMPLO Modelo para adicionar um novo array e o k.

Para adicionar um novo array e o k, adicione um objeto com o modelo a seguir:   

``` Objeto (builder)   
KComplementary kComplementary = new KComplementary.Builder()
                .k(2)
                .elementoArray(1)
                .elementoArray(2)
                .elementoArray(0)
                .elementoArray(-1)
                .elementoArray(3)
                .elementoArray(1)
                .build();
```
## Autor:

Ricardo Farias.

https://www.linkedin.com/in/ricardo14231/

## Licença:

MIT
