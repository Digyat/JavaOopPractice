public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private double soundLevel;

    public Tiger(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    public Tiger() {
        super("Tiger");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
    @Override
    public void walking(int speed) {
        System.out.println("Tiger: I am moving at the speed " + speed);

    }
    public void walking() {
        int defaultSpeed = 40;
        System.out.println("Tiger: I am moving at the speed " + defaultSpeed);
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }
}
