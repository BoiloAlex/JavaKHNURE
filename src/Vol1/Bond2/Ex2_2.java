package Vol1.Bond2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* Написать программу, которая находит сумму цифр произвольного целого числа
* */
public class Ex2_2 {
    public static void main (String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(reader.readLine());
        System.out.println("Сумма цифр числа " + chislo + " = " + SumCifr(chislo));
    }

    public static int SumCifr(int chislo){
        int sum = 0;
        int cifra;
        while (chislo > 0){
            cifra = chislo % 10;
            sum += cifra;
            chislo = (chislo - cifra) / 10;
        }
        return sum;
    }
}
