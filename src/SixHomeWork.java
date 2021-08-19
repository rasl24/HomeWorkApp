public class SixHomeWork {
    public static void main(String[] args){
        Animal cat = new Cat("Барсик", 200, 0);
        Animal dog = new Dog("Шарик", 500, 10);

        cat.run(300);
        cat.swim(2);
        dog.run(600);
        dog.swim(20);
    }
}
