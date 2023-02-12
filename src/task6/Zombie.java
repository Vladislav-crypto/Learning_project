package task6;
public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh";
    public Zombie(String name) {
        super(name + " the Zombie", 5 );
    }
    // Overload this method to make SCREAMS
    @Override
    public void growl(){
        System.out.print(scream);
        super.growl();
    }
    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
//        public void attack() {
//            super.attack();
//            growl();
//        }
    }
}
