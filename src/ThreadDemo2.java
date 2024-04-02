

//Approach-2
public class ThreadDemo2 {
    public static void main(String []srgs) {
        Runnable r = new Runnable() {
            public void run() {
                for(int i = 0 ; i <= 5 ; i++ ) {
                    System.out.println(i);
                }
            }
        };

        Thread tr = new Thread(r);

        tr.start();

    }
}
