public class SevenHomeWork {
    public static void main(String[] args){
        CatL7[] cats = new CatL7[5];
        cats[0] = new CatL7("Барсик", 10);
        cats[1] = new CatL7("Рыжик", 5);
        cats[2] = new CatL7("Дуся", 15);
        cats[3] = new CatL7("Биляш", 20);
        cats[4] = new CatL7("Мурка", 10);
        Plate plate = new Plate(40);

        plate.info();
        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
        plate.info();
        plate.addFood(50);
        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
        plate.info();
    }
}
