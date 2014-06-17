package Vol1.Bond7.Ex7_2;

public class QueuePopException extends QueueException{
    public QueuePopException(){
        super("вы пытаетесь считать из пустой очереди");
    }
}
