
//Appproach-1
public class ThreadDemo1 implements Runnable {

    public void run() {
        for(int i = 0 ; i <= 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String [] args) {
        ThreadDemo1 th = new ThreadDemo1();

        Thread t = new Thread(th);

        t.start();
    }
}
