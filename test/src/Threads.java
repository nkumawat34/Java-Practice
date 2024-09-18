

public class Threads extends Thread {

    public static int amount=0;
    public void run(){

        amount++;
    }
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();


    System.out.println(amount);
    amount++;
    System.out.println(amount);

    }
}
