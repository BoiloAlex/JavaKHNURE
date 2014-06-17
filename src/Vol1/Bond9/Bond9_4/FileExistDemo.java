package Vol1.Bond9.Bond9_4;


public class FileExistDemo {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        FileExist.ToDo(".");
        System.out.println(" время " + (System.currentTimeMillis() - before));
    }

}
