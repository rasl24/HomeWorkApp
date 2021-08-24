public class CatL7 {
    private String name;
    private int appetite;
    private  boolean satiety;

    public CatL7(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate){
        if(!plate.isEmptyPlate(appetite) && !satiety) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " ест");
        }else if(plate.isEmptyPlate(appetite)){
            System.out.println(name + " не поел(а)");
        } else if(satiety){
            System.out.println(name + " поел(а)");
        }
    }
}
