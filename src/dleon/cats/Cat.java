package dleon.cats;

import dleon.animal.Animal;

public class Cat implements Animal {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "cat " +this.name +", age " +this.age;
    }

}
