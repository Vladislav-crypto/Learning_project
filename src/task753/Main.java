package task753;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
/*
You have to pass to print() method anonymous Formatter
which add to the beginning of the line two astericks ("** ... **")
*/


        CoolPrinter.add("Own, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");
        //CoolPrinter.print(/*pass anonymous Formatter here*/);

        CoolPrinter.print(new Formatter() {
            @Override
            public String format(String str) {
                return "** " + str + " **" ;
            }
        });
/*
This fragment of code has to output

** Own, two, **
** I love you. **
** Three, four, **
** Touch the floor. **

Spaces are important.

*/
    }
}
