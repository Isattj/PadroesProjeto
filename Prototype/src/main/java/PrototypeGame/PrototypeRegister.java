package prototypegame;
import java.util.HashMap;
import java.util.Map;



public class PrototypeRegister {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String key, Prototype prototype){
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key){
        Prototype p = prototypes.get(key);
        if(p == null){
            throw new RuntimeException("Prototype não encontrado: " + key);
        }
        return p.clone();
    }
}
