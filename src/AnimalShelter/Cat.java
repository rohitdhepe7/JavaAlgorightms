package AnimalShelter;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String name() {
        return "cat: " + name;
    }
}
