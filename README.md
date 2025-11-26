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
>- Faz uma coisa bem feita 
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

## Aula 07/08- Resumo livro: Engenharia de Software Moderna - Cap 5.6
### SOLID 
>- Solid, na verdade, ele é um acrônimo certo, então cada letrinha desse solid significa um dos 5 princípios que ele resume.
>- Programar orientado ou objetos do jeito certo.

### Principio da responsabilidade unica- SINGLE RESPONSIBILITY PRINCIPLE
>- Esse princípio é uma aplicação direta da ideia de coesão.
>- É muito importante que cada um tenha seu papel definido 

### Princípio da segregação de interfaces
>- Cada coisa tem suas interfaces
>- Cada uma tem um responsabilidade única 

### Arquitetura dos arquivos java- Orientados a objetos
>-   Entity- Dados
>-   Repository- JPA spring data
>-   Services- Lógica (Use cases)
>-   Controller- Api rest
>-   Padronização- Interfaces 

### Principais tipos de setas 
>- Seta herança- linha cheia, seta vazada
>- Seta de interface/ implementação- linha tracjada, seta vazada
>- Seta da associação- Variável- linha cheia, seta cheia

## Aula 11/08- Resumo livro: Engenharia de Software Moderna - Cap 5.6.3
### Princípio de inversão de dependências
>-  Uma classe precisa de controladores- que são as interfaces de serviço
>-  O princípio da inversão da dependência é, eu não dependo direto de alguém. Eu dependo de uma interface, certo? Mas alguém precisa colocar o cara lá. Quem faz isso para nós no Spring é o autowired.
>-  Uma classe cliente deve estabelecer dependências prioritariamente com abstrações e não com implementações concretas

### Prefira composição a Herança
>- A herança faz com que tudo do pai, vai para o filho, violado o encapsulamento das classes pai.- limitante
>-  Associação é a maneira mais segura de criar relações.
>-  Quando usar a herança-> quando os filhos de uma super classe não tiverem relação entre eles, e um virá o outro. O outro virá um certo. Aí você usa herança.

### Principio de Demeter
>-  Defende que a implementação de um método deve invocar apenas os seguintes outros métodos:
>-  de sua própria classe (caso 1)
>-  de objetos passados como parâmetros (caso 2)
>-  de objetos criados pelo próprio método (caso 3)
>-  de atributos da classe do método (caso 4)
>-  É um código sem ter ou chamar um monte de aclopamento

### Padrão aberto/fechado
>-  Uma classe deve estar fechada para modificações e aberta para extensões.

## Aula 21/08- Desing patterns
- Singleton- 


## Aula 21/08- Desing patterns
- A flecha tracejada - significa herança 

## Aula 28/08- Modulo de fundamentos 
Caracteristicas da arquitetura = requisitos não funcionais
>- Ou seja tudo que tenha haver com as funções gerais de um sistema.
>- Como e o que um software precisa para operar.
>- Suplly chain software- A dependencia que as empresas de software livres- Cobernits
>- trade off- A caracteristica mais buscada pelos engenheiros de softwares em suas aplicações é a SEGURANÇA

Decisões arquiteturais
>- Escolhemos com qual arquitetura vamos usar.

Principios de Design
>- A partir da escolha de arquitura exemplo como por camadas, o usamos microsserviços buscamos um baixo acoplamento.
>- Regras básica para seguir e contruir a arquitetura

## Aula 01/09- Expectativa de um arquiteto
>- Analisar constantemente a arquitetura
>- Atualizar-se com as tendências
>- Instruir a equipe, experiência e exposição diversificada 
>- Noção de negócios
>- Analisar continuamente a arquitetura

DevOps
>- Planejar 
>- Programar
>- Integra
>- Opera
>- Publicar o código em um lugar central, tendo ferramentas para a integração continua
>- Testar, validar -> Impantar, publicar para o cliente final
>- Monitorar ambiente
>- Feedback do código com o usuário final
>- Sistema de controle de versão
>- Analise estática de código

## Aula 04/09- Pensamento arquitetônico
>- Requisitos funcionais tem os não funcionais e as as características da arquitetura são esses requisitos.
>- Esses são os 3 pontos, então, requisitos não funcionais, que é característica, arquitetura que eu vou usar e regras básicas que eu tenho que seguir para eu não estragar a minha arquitetura.

### Arquitetura vs design

> - O arquiteto é responsável por analisar requisitos comerciais para assim definir as características da arquitetura.
> - Identificando os atributos, selecionando os padrões e estilos tendo o domínio do problema. 
>- Criando componentes e soluções. 
>-Por conseguinte com a feitura dos artefatos são passados para a equipe de desenvolvimento. 
>-Responsáveis por criarem os diagramas e demais componentes essas atividades constituem o design. 

### Formação no modelo T
- Amplitude técnica: O escopo de detalhes técnicos difere entre os desenvolvedores e arquitetos.
O desenvolvedor que deve ter profundidade técnica para realizar o trabalho.
O arquiteto deve ter uma grande amplitude técnica, para que tenha um ponto de vista da arquitetura.
A pirâmide representando todo o conhecimento. Dividida em 3 seções: O que você sabe? O que não sabe? O que não sabe que não sabe?
Para um arquiteto uma grande parte de seu valor é o amplo conhecimento da tecnologia e como usá-la para resolver problemas específicos.
As partes mais importantes da pirâmide para os arquitetos são o topo e o meio a amplitude técnica de um arquiteto é vista na parte central da pirâmide.
> - Amplitude mais importante que a profundidade
> - Manter-se atualizado em especializações em várias áreas
> - Tudo na arquitetura é um trade-off- Depende
> - Uma vantagem é a extensibilidade arquitetural e o desacoplamento do serviço. Entretanto o acesso a dados e preocupações com os mesmo.


## Aula 08/09- Pensamento arquitetônico- Trade-off compensação
>- Em um sistema de leilão com muitiplos itens, abrimos mão da simpliciadade do sistema para ganhar escola em performance.
>- No subscriber tem pedir- pooling buscar a mensagem. 1-n -GRUPO WHATSAPP- + mais impacto
>- observer- Mecanismo de tópicos. Broker apache kafka exemplo de um tópico.
>- Fila, alguem coloca a mensagem na fila e quem tem interesse vai lá buscar a mensagem na fila. Ele busca e depois processa a mensagem.
>- Mantem a ordem no armazenamento.Tem uma fila para cada instância. 1-1 CARTÃO NATAL- Sender - receivers extensabilidade arqitetural -menos impacto
>- Se o teu sistema pode usar a mesma mensagem pra todos os serviços, o tópico é mais indicado. mas se você precisa de mensagens específicas, a fila seja mais indicada.
>- Diferenças: 
>- Tópico-
Publicador-Subscriber (1 para muitos).
-Mensagem é enviada para todos os inscritos (subscribers).
-Subscribers fazem pooling ou recebem via observer.
-Alta escalabilidade, mais impacto.
-Pode manter ordem por partição.
- Desacoplamento
>- Fila-
-Produtor-Consumidor (1 para 1).
-Mensagem é consumida por apenas um consumidor.
-Consumidor busca a mensagem diretamente na fila.
-Cartão de Natal: cada um recebe o seu, individualmente.
-Extensibilidade arquitetural, menos impacto, mais controle.
-Mantém ordem por fila, uma fila por instância
- Visibilidade isolada..
>- Se juntarmos a fila com o tópico, temos o armazenamento buffer. Diminuimos o acomplamento. Mas aumentamos os custos.
>- Separação temporal dos processos.

## Aula livro engenharia: Cap 4

 Definição das características da arquitetura

Auditoria, Desempenho, Segurança, Requisitos, Dados, Legalidade e Escalabilidade- uma solução de software consiste nos requisitos do domínio e nas características da arquitetura.

- Definição dos requisitos
- Cada característica precisa atender esses três critérios.
	-Especifica 
	-Deve ter influência estrutural
	-Essencial ou importante

Recursos diferenciais
- Explícita: Especifica uma consideração do design fora do domínio

- Implícita: Influencia um aspecto estrutural do design

Características operacionais
- Disponibilidade: (24/7)
- Continuidade: Capacidade de recuperação de desastres.
- Desempenho: Testes de estresse.
- Recuperabilidade: Requisitos de continuidade
- Confiabilidade/Segurança: Avalia se o sistema precisa ser à prova de falhas ou se tem uma missão crítica no modo como afeta a vida das pessoas.
- Robustez: Capacidade de lidar com condições de erro.
- Escalabilidade: A capacidade de o sistema rodar e operar quando o número de usuários ou requisições aumenta.

Características estruturais
- Configuração
- Extensão
- Instabilidade
- Aproveitamento/ reutilização
- Localização
- Manutenção
- Portabilidade: transferir um sistema para outro produto ou componente
- Suporte
- Atualização

Características transversais da arquitetura
- Acessibilidade
- Armazenamento
- Autenticação
- Autorização
- Legalidade
- Privacidade
- Segurança: usar o sistema com eficiência e satisfação.
- Suporte
- Usabilidade/ viabilidade: usar o sistema com eficiência.

Adequação funcional: 
- Representa o grau no qual um produto ou um sistema fornece funções que atendem as necessidades declaradas e implícitas quando usados sob certas condições.

Totalidade funcional:
- O grau no qual o conjunto de funções cobre todas as tarefas especificas e objetivos do usuário.

Correção funcional:
- O grau no qual um produto ou um sistema fornece resultados corretos com o grau de precisão necessário.

Adequação funcional: 
- O grau no qual as funções facilitam a realização de tarefas e objetivos específicos.

Trade-offs  arquitetura menos pior
- Numa mire na melhor arquitetura, mas na arquitetura menos pior.

## Aula livro engenharia: Cap 4- 09/10
- Circuit breaker
O que é o padrão do disjuntor
>- Ajuda a lidar com falhas que podem levar períodos variados para serem recuperadas quando um aplicativo se conecta a um serviço ou recurso remoto.

- Padrão que protege sistemas de falhas repetidas em serviços externos, evitando sobrecarga e falhas em cascata.  

### Problema
- Chamadas a serviços remotos podem falhar por indisponibilidade ou lentidão.  
- Tentar repetidamente consome recursos e pode travar o sistema.  

### Solução
- Usa três estados principais:  
  - **Fechado**: chamadas normais, contabiliza falhas.  
  - **Aberto**: falha imediata, sem tentar por um tempo.  
  - **Meio-aberto**: algumas tentativas de teste; se der certo, volta ao normal.  

### Benefícios
- Evita falhas em cascata.  
- Reduz tempo de espera (falha rápida).  
- Dá tempo para recuperação do serviço.  
- Facilita monitoramento da saúde do sistema.  

### Cuidados
- Ajustar limites de falha e tempo de espera.  
- Oferecer respostas alternativas (cache, valor padrão).  
- Monitorar abertura e fechamento do disjuntor.  
- Usar versões adaptativas quando possível.  

### Quando usar
- Dependência de serviços externos instáveis.  
- Cenários de alta demanda ou risco de sobrecarga.  
- Necessidade de estabilidade em ambientes distribuídos.  

### Quando não usar
- Recursos locais, sem dependência remota.  
- Quando o Retry simples já resolve.  
- Em arquiteturas baseadas em filas.  

## Aula: 16/10- Retry pattern

### Retry pattern- evita a aceleração

- Tentar e desistir
- Retry after delay- Espaçar as tentativas:
- Ele vai parar de tentar, mas o mais importante não é esse momento. O mais importante é o espaçar as tentativas para dar tempo do outro serviço se recuperar.

  A grande bola de lama
  - arquitetura de unitária- software de microndas
  - Clintes servidor- desktop servidor- servidor no meio e clientes na ponta- ERPS da TOTVS
  - Modelo we- O servidor Web se conecta no banco- criação de dependencias
  - Existe uma mistura de modelas-
 
  - Sistemas dividios em camadas- Corba- Broeker- No azure service Bus
  - Uma linguagem intermediaria que adaptava outras linguagens de programação, foi a primeira vez que eles pensaram nisso.
  - Netflix- api rest json- GRPC
 
  - Sistemas precisam evoluir
  - MONOLITO: Acoplamento  Vamos lá, é um sistema aonde todas as funcionalidades estão no mesmo.
  - Dapper. Ele é um run time pra te ajudar a construir aplicações em micro serviços- Side car
  - Sem acoplamenro com o sistemas de nuvem- Abstração
  - O dapper suporta transações distribuídas

## Aula livro engenharia: Cap 10- 20/10- Estilo de arquitetura em camadas

O que é:
- É um dos estilos mais comuns. Ele é o padrão de fato da maioria das aplicações, basicamente por sua simplicidade, familiaridade e baixo custo.

Topologia:
- são organizados em camadas horizontais lógicas, com cada camada tendo uma função específica dentro da aplicação (como lógica de apresentação ou lógica de negócio).
- Cada camada do estilo da arquitetura em camadas tem uma função e responsabilidade específicas dentro da arquitetura.
- Os componentes em uma camada específica estão limitados em escopo, lidando apenas com a lógica que pertence a essa camada.
- Contudo o trade-off desse benefício é uma falta de agilidade geral (a capacidade de responder rápido à mudança).

Camadas de Isolamento:
- Camadas pode ser fechada ou aberta.
- Uma camada fechada significa que, conforme uma requisição desce de camada em camada, ela não pode pular nenhuma, mas pode passar pela camada imediatamente abaixo dela para chegar na próxima.
  
Adicionando Camadas:
- Um modo de designar arquiteturalmente essa restrição é adicionar à arquitetura uma nova camada de serviços contendo todos os objetos de negócio compartilhados.
- Utilizar o conceito de camadas abertas e fechadas ajuda a definir a relação entre as camadas da arquitetura e os fluxos da requisição.

Por que Usar Esse Estilo de Arquitetura?
- Arquitetura em camadas é uma boa escolha para aplicações ou sites pequenos e simples.

Classificações das Características da Arquitetura:
- Custo geral e a simplicidade são os pontos fortes básicos do estilo da arquitetura em camadas.
- Taxas de implementabilidade e testabilidade são muito baixas para esse estilo de arquitetura.
- Desempenho é sempre uma característica interessante para classificar a arquitetura em camadas.

## Aula livro engenharia: Cap 11-27/10- Estilo de Arquitetura em Pipeline

Estilo de Arquitetura Pipeline:
- Conjunto de programas- Entrada e saída- Modulos super especialistas
- Modulo filtro- tarefas especificas- canos= modulos prontos para fazer o processamento
- Input= entrada padrão dos dados
- Print= escreve na saída
- Um programa produz a informação para o proximo programa.
- Sistema bancário do Brasil é assim. São entradas e saídas padrões

Canal:
- Liga em programa ao outro
  
Filtros:
- Componentes
  
Produtor:
- O ponto de partida de um processo, de saída apenas, às vezes chamado de origem.
  
Transformador:
- Aceita a entrada, realiza opcionalmente uma transformação em algum ou todos os dados, então encaminha para o canal de saída. Os defensores funcionais reconhecerão esse recurso como mapa.
  
Verficador:
- Aceita a entrada, testa um ou mais critérios, então produz opcionalmente uma saída, com base no teste. Os programadores funcionais reconhecerão isso como semelhante à redução.
  
Consumidor:
- Vai usar a informação

Arrastando componentes e criando a sua lógica- Pipe
Node-RED
- Inject- Topic- Alícia- injetar a cada 1 seg, intervalo 1 seg. - Conexão com o debug
- Debug- Criação de um evento
- Recebe uma mensagem passa essa mensagem

## Aula: 30/10- Código Kafka
- Código- Kafka um paint no Azure

## Aula livro engenharia: Cap 12- 03/11- Estilo de Arquitetura Microkernel

O que é:
- Estilo é um ajuste natural para os aplicativos baseados em produto (empacotados e disponibilizados para download e instalação como uma única implementação monolítica.

Topologia:
- Estrutura monolítica relativamente simples consistindo em dois componentes da arquitetura: um sistema central e componentes de plug-in.
- A lógica do aplicativo é dividida entre componentes de plug-in independentes e o sistema central básico, fornecendo extensão, adaptação e isolamento dos recursos da aplicação e lógica de processamento personalizada.

Sistema Central:
- Funcionalidade mínima requerida para rodar o sistema.
- Aplicação monolítica inteiro compartilhe um único banco de dados.

Componentes de Plug-in:
- Autônomos e independentes, contendo um processamento especializado, recursos adicionais e um código personalizado para melhorar ou estender o sistema central.
- Usados para isolar um código altamente volátil, criando uma melhor manutenção e testabilidade na aplicação.
- Componentes de plug-in sejam independentes entre si e não tenham dependências entre eles.

Beneficios:
- Bordagem do acesso remoto para acessar os componentes de plug-in implementados como serviços individuais são que ele fornece um melhor desacoplamento geral do componente.
- Melhor escalabilidade e taxa de transferência.

Registro:
- Precisa saber quais módulos de plug-in estão disponíveis e como obtê-los.
- Contém informações sobre cada módulo de plug-in, inclusive coisas como nome, contrato dos dados e detalhes do protocolo de acesso remoto.
- Estrutura de mapa interna que o sistema central possui, contendo uma chave e a referência do componente de plug-in, ou pode ser tão complexo quanto uma ferramenta de registro e descoberta incorporada no sistema central ou implantada externamente.

Contratos:
- Padrão em um domínio dos componentes de plug-in e incluem o comportamento e os dados de entrada e saída retornados do componente de plug-in.
- Encontrados nas situações em que os componentes de plug-in são desenvolvidos por terceiros, em que você não tem nenhum controle sobre o contrato usado pelo plug-in.

Exemplos e Casos de Uso
- IDE Eclipse PMD, Jira e Jenkins,
- Navegadores da internet

Classificações das Características da Arquitetura:
- Simplicidade e custo geral são os principais pontos fortes do estilo de arquitetura microkernel.
- Escalabilidade, tolerância a falhas e elasticidade são os principais pontos fracos.
- Estilo de arquitetura microkernel é único, no sentido de que pode ser particionado por domínio e tecnicamente.
- Performance sempre é uma característica interessante de classificar com o estilo de arquitetura microkernel.

## Aula: 06/11- Código microkernel
- Código- Código microkernel

## Aula livro engenharia: Cap 17- 10/11- Arquitetura de Microsserviços

O que é:
- O conceito do contexto delimitado representa um estilo de desacoplamento.
- O principal objetivo dos microsserviços é o alto desacoplamento, modelando fisicamente a noção lógica do contexto delimitado.

Topologia:
- O tamanho do serviço nos microsserviços é muito menor que em outras arquiteturas distribuídas, como a arquitetura orientada a serviços e baseada em orquestração.
- Os arquitetos esperam que cada serviço inclua todas as partes necessárias para operar de modo independente

Distribuída:
- Cada serviço roda em seu próprio processo, que originalmente implicava um computador físico, mas rapidamente evoluiu para máquinas virtuais e contêineres.
- Desacoplar os serviços nesse grau permite uma solução simples para um problema comum nas arquiteturas com muita infraestrutura multilocatária para hospedar as aplicações.
- Separar cada serviço em seu próprio processo resolve todos os problemas trazidos pelo compartilhamento.

Contexto Delimitado:
- Cada serviço modela um domínio ou um fluxo de trabalho.
- Cada serviço deve representar um domínio ou um subdomínio.

Granularidade:
- Tornar seus serviços pequenos demaiS.

Finalidade:
- O limite mais óbvio conta com a inspiração para o estilo de arquitetura, um domínio. O ideal é que cada microsserviço seja extremamente coeso de modo funcional, contribuindo com um comportamento importante em nome do aplicação em geral.

Transações:
- Os contextos delimitados são fluxos de trabalho corporativos e, muitas vezes, as entidades que precisam cooperar em uma transação mostram aos arquitetos um bom limite de serviço. Como as transações causam problemas nas arquiteturas distribuídas, se os arquitetos conseguem projetar seu sistema para evitá-las, eles geram designs de projeto melhores.

Coreografia:
- Se um arquiteto cria um conjunto de serviços que oferece um excelente isolamento do domínio, mas requer uma grande comunicação para funcionar, o arquiteto pode considerar reagrupar esses serviços em um serviço maior para evitar o sobrecarga (overhead) de comunicação.

Isolamento dos Dados:
- Evitar o acoplamento, inclusive os esquemas e os bancos de dados compartilhados usados como pontos de integração.

Camada da API:
- Imagens dos microsserviços inclui uma camada da API entre os consumidores do sistema.

Reutilização Operacional:
- As preocupações operacionais comuns aparecem em cada serviço como um componente separado, que pode ser de propriedade de equipes individuais ou de uma equipe de infraestrutura compartilhada.
- Os componentes sidecar comuns se conectam para formar uma interface operacional consistente em todos os microsserviços.

Front-ends:
- O front-end monolítico apresenta uma IU que faz chamadas atráves da camada da API para atender as requisições do usuário. O front-end pode ser um aplicação avançado para desktop, celular ou web.

Transações e Sagas:
- 	Não faça transações nos microsserviços; pelo contrário, corrija a granularidade!
-   Por vezes, são necessárias algumas transações nos serviços; se for o recurso dominante da arquitetura, foram cometidos erros!

Classificações das Características da Arquitetura:
- Tolerância a falhas e a confiabilidade são impactadas quando é usada muita comunicação entre os serviços.
- Os pontos altos dessa arquitetura são escalabilidade, elasticidade e ser evolutiva.
- Performance é outro motivo para os microsserviços sempre usarem a coreografia, não a orquestração, pois um menor acoplamento permite uma comunicação mais rápida e menos gargalos.
- Arquitetura de microsserviços é uma arquitetura centrada no domínio, em que cada limite do serviço deve corresponder aos domínios.

## Aula: 13/11- Código Dapr- microserviço
- Código- Código escrito de maneira distribuido.

## Aula: 17/11- Continuação do Código Dapr- microserviço
- Código- Terminamos o Código de microserviços usando o Dapr. 
