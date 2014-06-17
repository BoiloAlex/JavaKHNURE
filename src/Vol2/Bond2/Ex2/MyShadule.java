package Vol2.Bond2.Ex2;

public class MyShadule  implements Runnable{
    String[] massege;
    long [] ms;

    public MyShadule(String[] massege, long [] ms ){
        this. massege = massege;
        this.ms = ms;
    }

    @Override
    public void run() {
        try{
        for (int i = 0; i < ms.length; i ++){
            System.out.println (massege[i]);
            Thread.sleep((long) ms[i]);

        }
        }
        catch (Exception e){
            System.out.println("Ошибочка вышла");
        }
    }
}
