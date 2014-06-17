package Vol1.Bond2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* Сосчитать сумму ряда 1! - 2! + 3! - 4! + ... + n!    n > 0;
* * */
public class Ex2_4 {
    public static void main (String[] args)throws Exception{
        System.out.print("Введите число n: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println("1! - 2! + 3! - 4! + ... + " + n + "! = " + fact(n));
    }

    public static int fact(int n){
        int fact = -1;
        int sum = 0;
        for (int i = 1; i <= n ; i ++){
            fact *=(-i);
            sum += fact;
            System.out.print(" + " + fact);
        }
        System.out.println();
        return sum;
    }
}
