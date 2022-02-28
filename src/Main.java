import dleon.animal.AllAnimals;
import dleon.cats.CatItem;
import dleon.dogs.DogItem;

public class Main {
    public static void main(String[] args) {
        AllAnimals allAnimals = new AllAnimals(new CatItem(), new DogItem());
        allAnimals.printAllAnimals();
    }
}
