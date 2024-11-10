public class Dolphin extends Animal{
    private String color;
    private int swimmingSpeed;
    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious food");
    }
    @Override
    public void eatingCompleted(){
        System.out.println("Dolphin: I have eaten fish.");
    }
    public void swimming(){
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
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
