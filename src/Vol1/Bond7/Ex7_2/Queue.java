package Vol1.Bond7.Ex7_2;

/*
* Создать класс очередь, основанный на циклическом массиве объектов.
* Возбуждать исключение при неудаче операций добавления и извлечения из очереди.
* Типы возбуждаемых исключений определить самому.
*
* */
public class Queue {
    private int[] array;
    private int begin, end;

    public Queue(int n) {
        array = new int[n];
        begin = n - 1;
        end = n - 1;

    }

    public int pop() throws QueuePopException {


        if (end == begin) {

            throw new QueuePopException();
        }
        end ++;
        if(end == array.length) end = 0;
        return array[end];
    }

    public void push(int item) throws QueuePushException {
        begin++;
        if (end == begin) {
            begin--;
            throw new QueuePushException();
        }
        if (begin == array.length)
            begin = 0;
        array[begin] = item;
    }

    public String toString() {
        String s = "\n";
        if (end < begin) {
            s += "begin->";
            for (int i = begin; i > end; i--)
                s += array[i] + " ";
            s += "-> end";
        } else if (end == begin) System.out.println("Очередь пустая");
        else {
            s += "begin-> ";
            for (int i = begin; i >=0; i--)
                s += array[i] + " ";
            for (int i = array.length - 1; i > end; i--)
                s += array[i] + " ";
            s += "-> end";
        }

        return s;
    }

}
