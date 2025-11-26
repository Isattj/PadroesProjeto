package main.java.proxygame;

public class NPCReal implements NPC{
    private String nome;
    private String historia;
    private String dialogoInicial;

    public NPCReal(String nome){
        this.nome = nome;
        carregarDadosDoNPC();
    }

    private void carregarDadosDoNPC(){
        System.out.println("Carregando dados do NPC: " + nome);
        try{Thread.sleep(1500);} catch(Exception e) {}

        this.historia = "Historia do personagem " + nome;
        this.dialogoInicial = "Olá, viajante! Eu sou " + nome + " e conheço todo este reino. Caso você possua alguma dúvida, estou aqui para te ajudar!"; 
    }

    @Override
    public void falar(){
        System.out.println(nome + ">> " +dialogoInicial);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Historia: " + historia);
    }
}
