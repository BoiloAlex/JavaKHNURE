package Vol2.Bond2.Ex1;
/*
* Создать потоек, который бы в течении 5 сек. печатал свое имя каждые полсекунды
* Сделать 2мя способома - класс Tread и интерфейс Runnable
*
* */
public class FiveSecDemo {

    public static void main (String [] args) throws InterruptedException {

        FiveSecThread prnt= new FiveSecThread("prnt");
        prnt.start();
        Thread.sleep(750);

        System.out.println ( Thread.currentThread().getName());


        (new Thread(new FiveSecRunnable())).start();
    }

}
