package main.java.proxygame;

public class NPCProxy implements NPC{
    private String nome;
    private NPCReal npcReal;

    public NPCProxy(String nome){
        this.nome = nome;
    }

    private void inicializar(){
        if(npcReal == null){
            npcReal = new NPCReal(nome);
        }
    }

    @Override
    public void falar(){
        inicializar();
        npcReal.falar();
    }

    @Override
    public void mostrarInformacoes(){
        inicializar();
        npcReal.mostrarInformacoes();
    }
}
