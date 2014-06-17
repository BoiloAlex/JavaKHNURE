package Vol1.Bond7.Ex7_2;

public class QueueException extends Exception {
    public QueueException(){
        super ("ошибка очереди");
    }
    public QueueException(String s){
        super (s);
    }
}

