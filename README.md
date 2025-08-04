# Design e arquitetura de software I
### Alícia Schiochet e Souza
### Turma: 144 6BN

Aula 31/07
Resumo livro: Engenharia de Software Moderna - Cap 5 - 5.3.1
Autor: Marco Tulio Valente

### O que é um software? 
> - Software resolve um problema, é uma simplificação de entidades, uma abstração.
> - Entendemos um problema real e o representamos em software, retratamos uma solução.

### O que é complexidade?
> - A complexidade está inerente a criação dos softwares, entretanto para contornar e facilitar o entendimento e a escrita, aplicamos o conceito das abstrações.
> - Nosso objetivo é decompor o problema em partes menores.

### Boas práticas na programação e dicas
> - Padrão de variaveis (camel case) Maiúsculo e minusculo. Facilita o entendimento
> - Aprender e padronizar o framework
> - Usar a estrutura de dados correta é fundamental

### Ocultação de informação
> - Ocultamos as informações e as expomos através de uma interface
> - Atraves de uma "Classe"
> - Guarda estado (var)
> - Comportamento

### Vantagens do ocultamento
> - Desenvolvimento em paralelo (organização em camadas)
> - Flexibilidade a mudanças 
> - Facilidade de entendimento   

## Aula 04/08- Resumo livro: Engenharia de Software Moderna - Cap 5.3.2
### Getters e Setters = encapuslamento
>- Incrementar os objetos.
>- Proteger a informação, encapuslar.

### O que é coesão?
>- Caracteristica que buscamos na escrita dos códigos
>- Toda classe precisa ter uma funcionalidade.
>- Temos que ter o bom senso ao definir o que é coesão
>- É o código mínimo pra eu poder fazer uma tarefa bem feita.
>- Exemplo a estrutura de dados da pilha

### Acoplamento
>- A interface USB é um exemplo de um baixo acoplamento
>- é uma coisa que está altamente acoplada é uma coisa que uma vez que eu conecto, eu não consigo mais desacoplar.
>- Sempre que tiver uma seta de associação entre 2 classes, você vai criar uma variável.
>- Um objeto tem a referencia paea outro objeto.
>- @autowired ( ele saem varrendo todos os nossos programas java, tem alguem que implementa a USB? então ele acha e repassa dinamicamente essa informação)
>- Ideia para que duas coisas não conversem direto.

## Maximize a coesão das classes e minimize o acoplamento entre elas.
> Escreva classes que cada uma faz uma coisa bem feita e impeça que elas tenham conexões diretas umas com os outros.




