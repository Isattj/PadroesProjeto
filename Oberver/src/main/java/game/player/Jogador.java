package main.java.game.player;
import main.java.game.observer.Observer;

public class Jogador implements Observer {
    private String nome;

    public Jogador(String nome){
        this.nome = nome;
    }

    @Override
    public void update(int  novoValorTotal){
        System.out.println("Jogador " + nome + " foi notificado. Novo valor total de sucata no mercado: " + novoValorTotal);
    }
}


