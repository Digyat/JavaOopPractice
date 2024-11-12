public class Dolphin extends Animal implements Swim{
    private String color;
    private int swimmingSpeed;
    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal);
    }
    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming(int swimmingSpeed){
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
