package prototypegame;

public class Goblin extends Enemy{
    public Goblin(){
        super("Goblin", 50, 10);
    }

    @Override
    public Enemy clone(){
        return new Goblin();
    }
}
