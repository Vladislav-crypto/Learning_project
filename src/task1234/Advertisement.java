package task1234;

public class Advertisement extends Thread {

    public static void show() {
        if (!Thread.currentThread().getName().equals("main"))
            System.out.println("The code for this excercise is:\nMULTITHREADING IS FUN");
        else
            System.out.println("It seems the launch was on the main thread...");

    }

//    @Override
//    public void run() {
//        System.out.println("Îäíà ðåêëàìà õîðîøî, ìíîãî - õîðîøî î÷åíü!");
//    }
}
