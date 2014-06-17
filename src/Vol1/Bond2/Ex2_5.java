package Vol1.Bond2;
/*
* Подсчитать, сколько шесизначных цифр имеют равную сумму трех первых и последних цифр.
* */
public class Ex2_5 {
    public static void main(String[] args){
        int count = 0;
        for (int  i = 100000 ; i < 1000000; i ++){
        if (rav(i)) count ++;
        }
        System.out.println (count);
    }
    public static boolean rav(int num){
        int num1 = 0;
        int num2 = 0;
        int cifr;
        for (int i = 0; i < 3; i++){
            cifr = num % 10;
            num1  +=  cifr;
            num = (num - cifr) / 10;
        }
        for (int i = 0; i < 3; i++){
            cifr = num % 10;
            num2  +=  cifr;
            num = (num - cifr) / 10;
        }
        return (num1 == num2)? true: false;
    }
}
