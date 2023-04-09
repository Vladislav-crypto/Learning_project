package task1234;

import java.io.IOException;

class Main {
     // Lunch thread on class Advertisement,
     // which implements Runnable
     // (it's hidden)
     public static void main(String[] args) {
//         Advertisement advertisement = new Advertisement();
//         Thread thread = new Thread(advertisement);
//         thread.start();


         // new AdThread(new Advertisement()).start();
//         Thread thread = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 Advertisement.show();
//             }
//         });
//         thread.start();
//
//         new Thread(Advertisement ::show).start();

         new AddThreads(new Advertisement()).run();
     }
}
