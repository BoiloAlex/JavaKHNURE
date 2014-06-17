package Vol1.Bond9.Bond9_5;

public class FileExistJAVADemo {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        FileExistJAVA.ToDo(".");
        System.out.println(" время " + (System.currentTimeMillis() - before));
    }
}
