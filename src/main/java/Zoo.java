public class Zoo {
    public static void main(String[] args) {
        Sparrow sparrow1 = new Sparrow(1, "M", 4);
        sparrow1.fly();
        sparrow1.eat();

        Fish fish1 = new Fish(1, "M", 2);

        moveAnimal(fish1);

        moveAnimal(sparrow1);

        // Object mapping to interface
        Flyable flyingBird = new Sparrow(1, "m", 4);
        flyingBird.fly();

    }


    /**
     * Polymorphism example
     * @param animal
     */
    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
