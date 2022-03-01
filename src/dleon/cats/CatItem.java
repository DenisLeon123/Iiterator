package dleon.cats;

import dleon.animal.Animals;
import java.util.*;
import static dleon.Support.*;

public class CatItem implements Animals<Cat> {
    private static int MAX_LENGTH = 5;
    Cat[] cats;

    public CatItem() {
        this.cats = new Cat[MAX_LENGTH];
    }

    public void prepare() {
        cats[0] = new Cat("Stepa", 1);
        cats[1] = new Cat("Kuzya", 1);
    }

    public void printCats(){
        for(Cat cat:cats){
            print(cat);
        }
    }

    @Override
    public Iterator<Cat> createIterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Cat> {

        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        @Override
        public boolean hasNext() {
            return (cursor != MAX_LENGTH && cats[cursor] != null);
        }

        @Override
        public Cat next() {
            int i = cursor;
            if (i >= MAX_LENGTH)
                throw new NoSuchElementException();
            cursor = i + 1;
            return cats[lastRet = i];
        }

        @Override
        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            try {
                cats[lastRet] = null;
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
