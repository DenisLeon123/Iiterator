package dleon.animal;

import dleon.cats.Cat;
import dleon.cats.CatItem;
import dleon.dogs.Dog;
import dleon.dogs.DogItem;
import static dleon.Support.*;

import java.util.Iterator;

public class AllAnimals {
    private CatItem catItem;
    private DogItem dogItem;

    public AllAnimals(CatItem catItem, DogItem dogItem) {
        this.catItem = catItem;
        this.dogItem = dogItem;

        this.catItem.prepare();
        this.dogItem.prepare();
    }

    public void printAllAnimals(){
        Iterator<Dog> dogIterator = dogItem.createIterator();
        Iterator<Cat> catIterator = catItem.createIterator();

        forEach(dogIterator);
        forEach(catIterator);
    }
}
