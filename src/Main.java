public class Main {

    public Main(String s, int i) {
    }

    public static void main(String[] args) {
/*

You have to overload class Zombie

*/

        Zombie zombie1 = new Zombie("Alice");
        System.out.println("Monster Alice the Zombie was created");
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);


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

    protected void attack() {
    }
}
