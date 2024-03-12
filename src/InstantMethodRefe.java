public class InstantMethodRefe {

    public void m2() {
        for(int i = 0 ; i <= 5 ; i ++ ) {
            System.out.println(i+"\t");
        }
    }
    public static void main(String []rags) {
        //Here we create the object for the this present class 
        InstantMethodRefe inf = new InstantMethodRefe();

        //Here we have a Runnable functional interface

        Runnable run = inf::m2;//Here we pass  the referance of m2 method place of run method

        //Here we pass the run object to the thread
        Thread t1 = new Thread(run);

        //Here we start the thread
        t1.start();


    }
}
