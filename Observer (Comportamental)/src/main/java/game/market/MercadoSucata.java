package main.java.game.market;

import main.java.game.observer.Observer;
import main.java.game.observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class MercadoSucata implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int valorTotal = 0;

    public void adicionarSucata(int valor){
        System.out.println("Sucata adionada no valor de: " + valor);
        valorTotal += valor;
        notificarObservers();
    }

    public int getValorTotal(){
        return valorTotal;
    }

    @Override
    public void adicionarObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(){
        for(Observer observer : observers){
            observer.update(valorTotal);
        }
    }
}
