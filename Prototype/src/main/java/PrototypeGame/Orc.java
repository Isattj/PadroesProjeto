package prototypegame;


public class Orc extends Enemy{
    public Orc(){
        super("Orc", 100, 20);
    }

    @Override
    public Enemy clone(){
        return new Orc();
    }
}
