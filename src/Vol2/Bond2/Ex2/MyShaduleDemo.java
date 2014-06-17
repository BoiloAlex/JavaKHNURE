package Vol2.Bond2.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MyShaduleDemo {
    public static void main (String[] args) throws FileNotFoundException {
        String[] massege;
        long [] ms;
        Random rnd = new Random();
        int n = rnd.nextInt(100);
        massege = new String[n];
        ms = new long[n];

        Scanner sc = new Scanner(new File("wANDw.txt"));

        for (int i = 0; i < n ; i ++){
            ms[i] = rnd.nextInt(1000);
            if (!sc.hasNext()) sc = new Scanner(new File("wANDw.txt"));
            massege[i] = sc.next();
        }
        System.out.println (n);


        MyShadule mys = new MyShadule(massege, ms);
        mys.run();


    }
}
