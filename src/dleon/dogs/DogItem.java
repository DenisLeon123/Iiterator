package dleon.dogs;

import dleon.animal.Animals;
import java.util.ArrayList;
import java.util.Iterator;
import static dleon.Support.*;

public class DogItem implements Animals<Dog> {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void prepare() {
        dogs.add(new Dog("Jerry", 6));
        dogs.add(new Dog("Rex", 8));
    }

    public void printCats(){
        for(Dog dog : dogs){
            print(dog);
        }
    }

    @Override
    public Iterator<Dog> createIterator() {
        return dogs.iterator();
    }
}
