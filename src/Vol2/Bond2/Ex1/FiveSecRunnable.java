package Vol2.Bond2.Ex1;

public class FiveSecRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(" FiveSecRunnable void run(): ");
                //System.out.println(this.getName());
                Thread.sleep(500);


            }
        } catch (InterruptedException e) {
            System.out.println(" FiveSecRunnable void run() прерван ");
        }
        System.out.println(" FiveSecRunnable void run() завершен" );


    }
}
