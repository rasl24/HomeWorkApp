public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int appetite){
        if (isEmptyPlate(appetite)){
            System.out.println("Тарелка пуста!");
        } else {
            this.food -= appetite;
        }
    }

    public boolean isEmptyPlate(int appetite){
        return food < appetite;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public void addFood(int addFood){
        this.food += addFood;
        System.out.println("В тарелку насыпали " + addFood + " корма");
    }
}
