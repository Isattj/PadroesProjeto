# Padrão de Projeto comportamental: Observer
O código presente nesta pasta se baseia no conteúdo do site "Refactoring Guru", referenciado no link abaixo:
https://refactoring.guru/pt-br/design-patterns/observer

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
Foi utilizado a LLM ChatGPT para obter auxílio na estruturação da implementação, melhor compreesão do padrão e correção de erros.

## O que é o padrão Observer e o que ele resolve?
É um padrão de projeto comportamental que permite criar um mecanismo de assinaturas, com o propósito de notificar os objetos (seus assinantes) sobre os eventos que ocorram em um objeto que eles estão observando.

Com ele é possível resolver o problema de um objeto (assinante) ficar constantemente consultando o objeto de interesse para ver se houve alguma mudança de estado. Com a implementação do Observer, quando houver alguma mudança no objeto de interesse, toda a sua lista de objetos assinantes serão notificados.

## Exemplo de implementação
Atualmente, um tipo de jogo que está se popularizando é o "Terror Cooperativo de Extração", que são jogos online onde os amigos se juntam para explorar mapas e coletar objetos que podem ser vendidos em um mercado para obter dinheiro, com o objetivo de bater uma meta de valor diário.

Um problema encontrado nesses jogos, é que para saber quanto do valor necessário já foi obtido, os jogadores precisam sempre retornar ao mercado, o que causa uma grande perda de tempo. Para solucionar este problema, utilizamos o padrão Observer, para que toda vez que os objetos forem vendidos no mercado, todos os jogadores do mapa sejam notificados sobre a atualização do valor acumulado pelo grupo, evitando voltas e consultas desnecessárias.

### Explicação do código
1. `observer/Observer.java`: Esta é a interface que todo observador deve implementar, representando qualquer jogador que deseja ser notificado quando o valor mudar. Ela possui o método update() que é chamado sempre que houver alguma alteração, passando o novo valor total para todos os jogadores.
2. `observer.Subject.java`: Esta é a interface do mercado, que está sendo observado por todos os jogadores. Dentro dela há três métodos responsáveis por adicionar um novo jogador, remover, e notificá-los.
3. `market/MercadoSucata.java`: Ele é responsável por manter uma lista de jogadores. Dentro deste código é feito o controle do valor total obtido pelos jogadores, adicioná-los, removê-los e notificá-los.
4. `player/Jogador.java`: Representa os jogadores. Dentro dele é implementado o Observer, simbolizando que este jogador pode ser notificado caso haja alguma mudança no valor total.
5. `Main.java`: Ela cria o mercado, 3 jogadores de exemplo, adiciona-os na lista de observadores, para que recebam notificação quando haja alguma alteração no valor, remove um jogador e adiciona sucatas no mercado.
