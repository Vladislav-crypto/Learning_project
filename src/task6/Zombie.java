package task6;

public class Zombie extends Main {
    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + "Zombie", 5);
    }
    // Overload this method to make SCREAMS


    @Override
    public void growl() {
        System.out.println(scream + " " + "Alice the Zombie growled");
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.println(scream.toUpperCase() + " " + "Alice the Zombie growled");
            super.growl();
        }
    }
    /* @Override
    public void attack(){
        super.attack();
        growl();
    }*/


}
