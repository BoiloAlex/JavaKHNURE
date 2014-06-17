package Vol1.Bond2;
/**
 * Написать програму, которая находит НОД двух целых положительных чисел.
 *
 */

public class Ex2_1 {
    public static void main(String[] args){
        System.out.println(gcd(25, 125));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }
}

