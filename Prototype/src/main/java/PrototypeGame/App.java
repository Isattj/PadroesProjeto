package prototypegame;

public class App{
    public static void main(String[] args){
        PrototypeRegister register = new PrototypeRegister();

        register.addPrototype("goblin", new Goblin());
        register.addPrototype("orc", new Orc());

        Enemy glo1 = (Enemy) register.getPrototype("goblin");
        Enemy glo2 = (Enemy) register.getPrototype("goblin");
        Enemy orc1 = (Enemy) register.getPrototype("orc");

        System.out.println("Inimigos criados:");
        System.out.println(glo1);
        System.out.println(glo2);
        System.out.println(orc1);
    }
}
