package prototypegame;

public abstract class Enemy implements Prototype, Cloneable{
    protected String nome;
    protected int vida;
    protected int dano;

    public Enemy(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    @Override
    public Enemy clone(){
        try{
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Erro ao clonar: " + e.getMessage());
        }
    }

    @Override
    public String toString(){
        return nome + " [Vida: " + vida + ", Dano: " + dano + "]";
    }
}

