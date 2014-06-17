package Vol1.Bond4.Ex4_2;

public class VectorDemo {
    public static void main(String[] args) {
        Vector.add("t-mail");
        Vector.add("alexander@deusstore.com");
        Vector.add("bessonniy@avers.in.ua");
        Vector.add("ccd@alfabank.kiev.ua");
        Vector.add("art.jump.art@gmail.com");
        System.out.println("количество записей " + Vector.count);
        for (int i = 0; i < Vector.count; i++)
            System.out.println("элемент №" + i + " = " + Vector.getI(i));
        Vector.removeI(3);

        System.out.println();
        for (int i = 0; i < Vector.count; i++)
            System.out.println("элемент №" + i + " = " + Vector.getI(i));

        Vector.clear();
        System.out.println("количество записей после очистки " + Vector.count);
    }

}
