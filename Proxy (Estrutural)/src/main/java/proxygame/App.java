package main.java.proxygame;

public class App {
    public static void main(String[] args){
        NPC aldeao = new NPCProxy("Aldeão");
        NPC cavaleiro = new NPCProxy("Cavaleiro");
        NPC mago = new NPCProxy("Mago");

        System.out.println("O jogador está distante de todos os NPCs...");


        System.out.println("O jogador se aproxima do Aldeão");
        aldeao.mostrarInformacoes();

        System.out.println("O jogador fala com o Aldeão");
        aldeao.falar();

        System.out.println("O jogador se aproxima do mago");
        mago.mostrarInformacoes();
    }
}
