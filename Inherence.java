public class Inherence {

    public static void main(String[] args) {


        Animal animal = new Animal("animal", 1, 1, 5, 5);
        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();
        Animal animal1 = new Animal("fish", 1, 1, 4, 4);
        Fish fish = new Fish("sezar", 4, 5, 1, 2, 2);
        fish.move(5);
        System.out.println(fish.getName());


    }
}


