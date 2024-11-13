public class Penguin extends Animal implements Walk, Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }
    public Penguin() {
        super("Penguin");
    }
    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("Penguin: I have eaten fish.");
    }
    @Override
    public void walking(int walkSpeed) {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + "mph");
    }
    public void walking() {
        int walkingSpeed = 3;
        System.out.println("Penguin: I am walking at the speed " + walkingSpeed + " mph");
    }
    @Override
    public void swimming(int swimSpeed){
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }
    public void swimming() {
        int swimmingSpeed = 20;
        System.out.println("Penguin: I am swimming at the speed " + swimmingSpeed + " nautical miles per hour");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
