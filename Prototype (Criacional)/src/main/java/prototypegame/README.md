# Padrão de Projeto criacional: Proxy
O código presente nesta pasta se baseia no conteúdo do site "Refactoring Guru", referenciado no link abaixo:
https://refactoring.guru/pt-br/design-patterns/prototype

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

## O que é o padrão Prototype e o que ele resolve?
Quando desejamos clonar um objeto, é necessário cirar um novo objeto que possui a mesma classe do anterior e inserir todos os campos e valores do original em suas respectivas cópias. Além de dar muito mais trabalho, alguns dados do objeto original
podem ser privados e impedir que a clonagem seja totalmente efetivada.

Para isso foi criado o padrão Prototype, responsável por atribuir o processo de clonagem para o prórpio objeto que será clonado. O método clonar é criado em uma interface comum para todos os objetos que permitem a clonagem. Ele cria um objeto da classe atual
e carrega todos os valores do antigo para o novo.

## Exemplo de implementação
Na maioria dos jogos existentes, há inúmeros inimigos iguais que devem ser derrotados ao longo do percurso do jogo. Porém o código do jogo teria uma grande sobrecarga ao copiar inimigos e todos os seus dados diversas vezes. Além de gerar dependência da classe original.
Para isso é implementado o método clone dentro de cada objeto pertencente a classe dos inimigos, permitindo que eles sejam clonados sem que haja problemas de dependência.

### Explicação do código
1. `Prototype.java`: Esta interface é responsável por definir que todo objeto que pode ser clonado, implementará o método `clone()`.
2. `Enemy.java`: É a classe base para todos os inimigos. Define quais atributos todos eles terão (nome, vida e dano).
3. `Goblin.java` e `Orc.java`: Definem os inimigos e os valores dos seus atributos. Além disso ele possui o método clone que foi herdado da classe Enemy.
4. `PrototypeRegister.java`: Ele é responsável por guardar os protótipos base, ou seja os objetos base que serão utilizados caso desejar fazer um clone. Dentro dele há o método `addPrototype()` que cria um novo objeto que permite a 
clonagem e adiciona a sua lista. E há também o método `getPrototype()` que realiza a busca de um objeto por meio da sua chave, e se encontrado, realiza sua clonagem.
5. `App.java`: Utilizada para realizar os testes da implementação. Ela faz a adição do Orc e do Goblin como padrões de clonagem do Prototype por meio do `register.addProtype`. Logo em seguida é realizado a clonagem do goblin 2 vezes e 1 vez 
do orc, que são apresentados ao final da execução da aplicação.
