# Padrão de Projeto estrutural: Proxy
O código presente nesta pasta se baseia no conteúdo do site "Refactoring Guru", referenciado no link abaixo:
https://refactoring.guru/pt-br/design-patterns/proxy

## Linguagem programação usada
Para realizar a implementação deste padrão de projeto foi utilizado a linguagem <b>Java</b> no VsCode.
Para tal utilização, foram necessários a instalação dos seguintes itens:
<ul>
  <li><b>JDK: </b> Ele serve para desenvolver, compilar e depurar aplicações em java. Para este projeto foi utilizado o JDK Temurin, presente no link abaixo:
  https://adoptium.net/pt-BR</li>
  <li><b>Extension Pack for Java:</b> Extensão presente no VsCode para download, que possui todas as principais funções do Java, como o Debbuger, Maven, Test Runner e Project Manager.</li>
  <li>Para rodar o código presente nesta pasta, é necessário somente instalar os dois itens acima e rodar o código clicando no botão "Run" do VsCode.</li>
</ul>

## Utilização da LLM
Foi utilizado a LLM ChatGPT para obter auxílio na ideia do exemplo utilizado, estruturação da implementação, melhor compreesão do padrão e correção de erros.

## O que é o padrão Proxy e o que ele resolve?
Em muitas aplicações, há um serviço muito grande implementado que consome muitos recursos do sistema, porém ele não é acessado frequentemente, havendo um carregamento desnecessário dos dados.
Para resolver este problema, o padrão de projeto estrutural Proxy foi criado. 

Este padrão sugere a criação de uma nova classe chamada Proxy, que possui a mesma interface do serviço real. Dessa forma, a implementação 
deve ser alterada para que ao invés de realizar as consultas no serviço real, elas passarem pelo Proxy.
Ele, por sua vez, cria um objeto do serviço real ao receber uma requisição e fica encarregado de retornar as informações ao usuário.

## Exemplo de implementação
Quando estamos em um jogo de estilo RPG, encontramos muitos NPC's (figurantes), que possuem seus prórpios nomes, histórias e falas programadas.
Porém, em um jogo com mapa muito grande, há inúmeros NPC's espalhados pelo local, que não há necessidade serem carregados se o jogador está muito longe do NPC.

E é aí que o proxy é utilizado. Ele fará requisições para o serviço real somente quando o jogador se aproximar de algum NPC. Evitando assim, um carregamento desnecessário de dados que não serão utilizados.

### Explicação do código
1. `NPC.java`: Define os métodos que todos os NPCs possuirão: falar e mostrar informações. Esses métodos serão utilizados pelo RealNPC e pelo Proxy para fornecer os dados ao jogador.
2. `RealNPC.java`: Este é o objeto que consideramos como "carregamento pesado". Na sua implementação temos um método chamado `carregarDadosDoNPC()` que obtém as informações de todos os NPC presentes no jogo.
3. `NPCProxy.java`: Ele representa o intermediário que fica entre o jogador e o NPCReal. Ele possui a implementação das funções `falar()` e `mostrarInformacoes()` que somente serão chamadas quando o jogador solicitar as informações.
4. `App.java`: Neste código são chamados três NPCs por meio de `new NPCProxy` garantindo que somente a informação daquele NPC está sendo carregada. Logo em seguida são chamadas os métodos mostrarInformacoes e falar para o npc criado.
