package Vol1.Bond2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* Написать програму проверки того, что введенное число X - простое.
* */
public class Ex2_3 {
    public static void main (String[] args)throws Exception{
        System.out.print("Введите число для проверки:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (simlpe(x)) System.out.println("Число " + x + " простое");
        else System.out.println("Число " + x + " не простое");
    }

    public static boolean simlpe(int x){
        boolean flag = true;

        for (int i = 2; i < (int) Math.sqrt(x); i++){
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
