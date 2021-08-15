public class Animal {
    int distance;
    String name;
    int maxRunning;
    int maxSwimming;

    Animal(String name, int maxRunning, int maxSwimming) {
        this.name = name;
        this.maxRunning = maxRunning;
        this.maxSwimming = maxSwimming;
    }

    void run(int distance) {
        if (distance > this.maxRunning) {
            System.out.println(this.name + " устал, он пробежал только " + this.maxRunning + " м.");
        } else {
            System.out.println(this.name + " пробежал " + distance + " м.");
        }

    }

    void swim(int distance) {
        if (distance > this.maxSwimming) {
            System.out.println(this.name + " устал, он проплыл только " + this.maxSwimming + " м.");
        } else {
            System.out.println(this.name + " проплыл " + distance + " м.");
        }

    }
}
