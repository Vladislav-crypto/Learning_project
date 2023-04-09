package task1234;

public class AddThreads implements Runnable {
    public AddThreads(Advertisement advertisement){

    }
    @Override
    public void run() {
        Advertisement.show();

    }


}
