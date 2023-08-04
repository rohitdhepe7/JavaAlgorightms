package AnimalShelter;

import java.util.LinkedList;

public class AnimalQueue {

    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kerry"));
        animals.enqueue(new Dog("Beji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println(animals.dequeueAny().name);
        System.out.println(animals.dequeueDogs().name);
        System.out.println(animals.dequeueCats().name);
    }
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal){
        animal.setOrder(order);
        order++;
        if (animal instanceof Dog){
            dogs.addLast((Dog) animal); // adds element at the end of the linked list
        }else if (animal instanceof Cat){
            cats.addLast((Cat) animal);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    //dequeue dogs
    public Dog dequeueDogs(){
        return dogs.poll(); //-----> removes the first element from the dogs linked list
    }

    //peek
    public Dog peekDogs() {
        return dogs.peek();
    }

    public Cat dequeueCats() {
        return cats.poll();
    }

    public Cat peekCats() {
        return cats.peek();
    }

    //dequeue any
    public Animal dequeueAny() {
        if (dogs.size() == 0){
            return dequeueCats();
        }else if (cats.size() == 0){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        }else {
            return cats.poll();
        }
    }

    public Animal peek() {
        if (dogs.size() == 0){
            return cats.peek();
        }else if (cats.size() == 0){
            return dogs.peek();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.peek();
        }else {
            return cats.peek();
        }
    }
}
