public class Penguin extends Animal implements Walk, Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }
    public Penguin() {
    	super("penguinAnimal");
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
    public void walking(int walkSpeed) {
        System.out.println("Penguin: I am walking at the speed: " + walkSpeed + "mph");

    }
    @Override
    public void swimming(int swimSpeed){
        System.out.println("The penguin is swimming at: " + swimSpeed);
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
