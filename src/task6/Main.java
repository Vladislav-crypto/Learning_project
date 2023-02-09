package task6;



public class Main {

   public Main(String s, int i) {
   }

    public static void main(String[] args) {
/*

You have to overload class task6.Zombie

*/

        Zombie zombie = new Zombie("Alice");
        System.out.println("Monster Alice Zombie was created");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);


/*
This fragment of code has to output

Monster Alice the Zombie was created
Raaaauuughhhh Alice the Zombie growled
RAAAAUUUGHHHH Alice the Zombie growled
Raaaauuughhhh Alice the Zombie growled

*/
    }


    protected void growl() {
    }


//    protected void attack() {
//    }
}
