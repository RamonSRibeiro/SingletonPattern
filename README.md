# Padrão Singleton em Java

## Sobre o projeto

Esse projeto foi feito para uma atividade sobre padrões de projeto, utilizando o padrão **Singleton** em Java.

A ideia foi fazer uma aplicação simples de configuração de sistema, onde só pode existir uma instância da classe `Configuracao`.

## Como funciona

A classe `Configuracao` possui algumas informações do sistema:

* Nome do sistema: Ubuntu
* Ambiente: Linux

O Singleton foi utilizado para garantir que, mesmo chamando o método `getInstancia()` várias vezes, sempre seja retornada a mesma instância da classe.

Para isso, foi utilizado:

* Um construtor `private`, para impedir que a classe seja instanciada diretamente;
* Uma variável `static` chamada `instancia`, que guarda a instância da classe;
* O método `getInstancia()`, que cria a instância caso ela ainda não exista e depois retorna a mesma instância.

## Testes

Foram feitos testes com JUnit para verificar se o Singleton está funcionando.

Os testes verificam:

* Se duas chamadas ao `getInstancia()` retornam a mesma instância;
* Se o nome do sistema retorna `"Ubuntu"`;
* Se o ambiente retorna `"Linux"`.

## Diagrama de classes

O projeto também possui um diagrama de classes mostrando a estrutura da classe `Configuracao`.

![Diagrama de Classes](diagrama.png)

## Conclusão

Com esse projeto foi possível entender na prática como funciona o padrão Singleton e como ele pode ser usado para garantir que uma classe tenha apenas uma instância durante a execução da aplicação.
