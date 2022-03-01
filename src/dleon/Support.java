package dleon;

import dleon.animal.Animal;
import java.util.Iterator;

public class Support {

    static public void print(Object obj){
        System.out.println(obj.toString());
    }

    static public void forEach(Iterator<? extends Animal> iterator){
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            print(animal.toString());
        }
    }

    static public void notNull(Object obj){
        if(obj == null)
            throw new NullPointerException("It's exception");
    }
}
