package task1232;

 class Main {

    // Lunch the show() method from the class Advertisement
    // (it's hidden) in a new Thread
    public static void main(String[] args){
        AdThread adThread = new AdThread();
        adThread.start();

    }

}
