package Vol1.Bond10.B3Many;

import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/*
* имеется отсортированное множество строк и 2 сторки s1<s2
* из множества выделить отрезки :
* a) [s1,s2)
* b) [s1,s2]
* c) (s1,s2)
* */
public class StringManyDemo {
    public static void main(String[] args) {
        SortedSet<String> mnozh = new TreeSet<String>();
        int n = 20;
        String s;
        for (int i = 0; i < n; i++)
            mnozh.add(CreateString());
        Iterator it = mnozh.iterator();
        int a = n / 3;
        int b = a * 2;
        int i = 0;
        String s1 = "", s2 = "";
        while (it.hasNext()) {
            s = (String) it.next();
            if (i == a) s1 = s;
            if (i == b) s2 = s;
            i++;
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("s1 = " + s1 + ", s2 = " + s2);

        //a) [s1,s2)
        SortedSet<String> m1;
        m1 = mnozh.subSet(s1, s2);
        //b) [s1,s2]
        SortedSet<String> m2;
        String s3 = "", s4 = "";// следущий после s2;
        it = mnozh.iterator();
        while (it.hasNext()) {
            s = (String) it.next();
            if (s.equals(s2) && it.hasNext())
                s3 = (String) it.next();
            if (s.equals(s1) && it.hasNext())
                s4 = (String) it.next();
        }
        m2 = mnozh.subSet(s1, s3);
        // c) (s1,s2);
        SortedSet<String> m3;
        m3 = mnozh.subSet(s4, s2);

        System.out.println("a) [s1,s2) ");
        it = m1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("b) [s1,s2] ");
        it = m2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("c) (s1,s2) ");
        it = m3.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


    }

    private static String CreateString() {
        Random rnd = new Random();
        byte[] b = new byte[6];
        b[0] = (byte) (65 + rnd.nextInt(23));
        for (int i = 0; i < 5; i++) {
            b[i + 1] = (byte) (rnd.nextInt(23) + 97);
        }
        return new String(b);
    }
}

