package dleon.dogs;

import dleon.animal.Animal;

public class Dog  implements Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog " +this.name +", age " +this.age;
    }
}
