package Vol2.Bond2.Ex1;

public class FiveSecThread extends Thread {

    public FiveSecThread(String s) {
        super(s);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(" FiveSecThread void run(): ");
                //System.out.println(this.getName());
                Thread.sleep(500);


            }
        } catch (InterruptedException e) {
            System.out.println(" FiveSecThread void run() прерван ");
        }
        System.out.println(" FiveSecThread void run() завершен" );


    }


}
