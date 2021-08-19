public class Cat extends Animal {
    Cat(String name, int maxRunning, int maxSwimming) {
        super(name, maxRunning, maxSwimming);
    }

    void swim(int distance) {
        System.out.println(this.name + " не умеет плавать.");
    }
}
