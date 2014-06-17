package Vol1.Bond7.Ex7_2;

public class QueueDemo {
    public static void main(String[] args) throws QueueException {
        Queue q = new Queue(20);
        int temp;
        try {

            //q.pop();
            for (int i = 0; i < 15; i++){
                q.push(i);
                q.push(i*2);
                System.out.print("  Pop "+q.pop() + " ;");
            }


            System.out.println(q);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
