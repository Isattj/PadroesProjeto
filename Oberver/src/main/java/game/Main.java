package main.java.game;

import main.java.game.market.MercadoSucata;
import main.java.game.player.Jogador;

public class Main {
    public static void main(String[] args){
        MercadoSucata mercado = new MercadoSucata();

        Jogador j1 = new Jogador("Matheus");
        Jogador j2 = new Jogador("Alice");
        Jogador j3 = new Jogador("Daniela");

        mercado.adicionarObserver(j1);
        mercado.adicionarObserver(j2);
        mercado.adicionarObserver(j3);

        mercado.adicionarSucata(150);
        mercado.adicionarSucata(340);

        mercado.removerObserver(j1);

        mercado.adicionarSucata(100);
    }
}
