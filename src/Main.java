import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/
        Tiger tiger = new Tiger("Tiger");
//        tigerObject.setNumberOfStripes(50);
//        tigerObject.setSpeed(50);
//        tigerObject.setSoundLevel(85);
//        String tigerAnimal = tigerObject.getNameOfAnimal();

        Dolphin dolphin = new Dolphin("DolphinAnimal");
//        dolphinObject.setColor("Blue");
//        dolphinObject.setSwimmingSpeed(85);

        Penguin penguin = new Penguin("PenguinBoy");


        tiger.eatingFood();
        dolphin.eatingFood();


        tiger.walking(30);import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;


        Tiger tiger = new Tiger("Tiger");
        Dolphin dolphin = new Dolphin("Dolphin");
        Penguin penguin = new Penguin("Penguin");


        tiger.eatingFood();
        dolphin.eatingFood();


        tiger.walking(30);
        dolphin.swimming(70);
        tiger.walking();
        dolphin.swimming();
        penguin.walking(30);
        penguin.swimming(30);

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tiger.getNameOfAnimal());
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Tiger ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        // get menu choice
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter Number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Set Speed");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.println("Set Sound Level: ");
                                tiger.setSoundLevel(keyboard.nextInt());
                                System.out.println("Age: ");
                                tiger.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                tiger.setWeight(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Sound Level: " + tiger.getSoundLevel());
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Weight: " + tiger.getWeight());
                                break;
                            case 3:
                                System.out.println("Make the tiger walk at what speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                tiger.walking(tiger.getSpeed());
                                break;
                            case 4:
                                System.out.println("Make the tiger eat!");
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphin.getNameOfAnimal());
                        // get menu choice
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Dolphin ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Age: ");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.println("Color: ");
                                dolphin.setColor(keyboard.next());
                                System.out.println("Swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Dolphin Age: " + dolphin.getAge());
                                System.out.println("Dolphin Height: " + dolphin.getHeight());
                                System.out.println("Dolphin Weight: " + dolphin.getWeight());
                                System.out.println("Dolphin Color: " + dolphin.getColor());
                                System.out.println("Dolphin Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;
                            case 3:
                                System.out.println("Make the dolphin swim at what speed? ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                dolphin.swimming(dolphin.getSwimmingSpeed());
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                        // get menu choice
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Penguin ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Age: ");
                                penguin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.println("Is it running? Yes/No");
                                if (keyboard.next() == "Yes") {
                                    penguin.setSwimming(true);
                                } else {
                                    penguin.setSwimming(false);
                                }

                                System.out.println("Walk Speed: ");
                                penguin.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Swimming speed: ");
                                penguin.setSwimSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Penguin Age: " + penguin.getAge());
                                System.out.println("Penguin Height: " + penguin.getHeight());
                                System.out.println("Penguin Weight: " + penguin.getWeight());
                                System.out.println("Penguin Walking Speed: " + penguin.getWalkSpeed());
                                System.out.println("Penguin Swimming Speed: " + penguin.getSwimSpeed());
                                break;
                            case 3:
                                if (penguin.isSwimming()) {
                                    System.out.println("Make the penguin swim at what speed? ");
                                    penguin.setSwimSpeed(keyboard.nextInt());
                                    penguin.swimming(penguin.getSwimSpeed());
                                } else {
                                    System.out.println("Make the penguin walk at what speed? ");
                                    penguin.setWalkSpeed(keyboard.nextInt());
                                    penguin.walking(penguin.getWalkSpeed());
                                }


                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                dolphin.swimming(dolphin.getSwimmingSpeed());
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard){
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu (Scanner keyboard, Animal animal){
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}





        dolphin.swimming(70);
        tiger.walking();
        dolphin.swimming();
        penguin.walking(30);
        penguin.swimming(30);

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tiger.getNameOfAnimal());
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Tiger ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        // get menu choice
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter Number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Set Speed");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.println("Set Sound Level: ");
                                tiger.setSoundLevel(keyboard.nextInt());
                                System.out.println("Age: ");
                                tiger.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                tiger.setWeight(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Sound Level: " + tiger.getSoundLevel());
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Weight: " + tiger.getWeight());
                                break;
                            case 3:
                                System.out.println("Make the tiger walk at what speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                tiger.walking(tiger.getSpeed());
                                break;
                            case 4:
                                System.out.println("Make the tiger eat!");
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphin.getNameOfAnimal());
                        // get menu choice
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Dolphin ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Age: ");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.println("Color: ");
                                dolphin.setColor(keyboard.next());
                                System.out.println("Swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Dolphin Age: " + dolphin.getAge());
                                System.out.println("Dolphin Height: " + dolphin.getHeight());
                                System.out.println("Dolphin Weight: " + dolphin.getWeight());
                                System.out.println("Dolphin Color: " + dolphin.getColor());
                                System.out.println("Dolphin Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;
                            case 3:
                                System.out.println("Make the dolphin swim at what speed? ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                dolphin.swimming(dolphin.getSwimmingSpeed());
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                        // get menu choice
                        System.out.println("What do you want to do with the animal?");
                        System.out.println("******* ANIMAL details menu for: Penguin ****** \n 1. Set properties\n 2. Display properties \n 3. Display movement \n 4. Display eating \n Enter choice (1-4):");
                        menuChoice = keyboard.nextInt();
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Age: ");
                                penguin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.println("Weight");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.println("Is it running? Yes/No");
                                if (keyboard.next() == "Yes") {
                                    penguin.setSwimming(true);
                                } else {
                                    penguin.setSwimming(false);
                                }

                                System.out.println("Walk Speed: ");
                                penguin.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Swimming speed: ");
                                penguin.setSwimSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Penguin Age: " + penguin.getAge());
                                System.out.println("Penguin Height: " + penguin.getHeight());
                                System.out.println("Penguin Weight: " + penguin.getWeight());
                                System.out.println("Penguin Walking Speed: " + penguin.getWalkSpeed());
                                System.out.println("Penguin Swimming Speed: " + penguin.getSwimSpeed());
                                break;
                            case 3:
                                if (penguin.isSwimming()) {
                                    System.out.println("Make the penguin swim at what speed? ");
                                    penguin.setSwimSpeed(keyboard.nextInt());
                                    penguin.swimming(penguin.getSwimSpeed());
                                } else {
                                    System.out.println("Make the penguin walk at what speed? ");
                                    penguin.setWalkSpeed(keyboard.nextInt());
                                    penguin.walking(penguin.getWalkSpeed());
                                }


                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                dolphin.swimming(dolphin.getSwimmingSpeed());
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

        private static int animalChoiceMenu(Scanner keyboard){
            int choiceGivenByUser;

            System.out.println("******* ZOO ANIMAL choice menu ******");
            System.out.println("1. Tiger");
            System.out.println("2. Dolphin");
            System.out.println("3. Penguin");

            System.out.println("Enter choice of animal:");
            choiceGivenByUser = keyboard.nextInt();
            return choiceGivenByUser;
        }

        private static int animalDetailsManipulationMenu (Scanner keyboard, Animal animal){
            int choiceGivenByUser;

            System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
            System.out.println("1. Set properties");
            System.out.println("2. Display properties");
            System.out.println("3. Display movement");
            System.out.println("4. Display eating");

            System.out.println("Enter choice (1-4):");
            choiceGivenByUser = keyboard.nextInt();
            return choiceGivenByUser;

        }
    }




