package Vol1.Bond3;

/*
* Создать массив на 100 элкементов и заполнить простыми числами
*
*
*
* Ускорить
* */
public class Ex3_2 {
    public static void main(String[] args){
        long[] simpleArr = new long[100];
        int i = 1;

        long before = System.currentTimeMillis();
        long num = (long) 1e16;
        simpleArr[0] = 2;
        while (i < 100){
            while (!simple(num)) num++;
            simpleArr[i] = num;
            num++;
            i++;
        }
        int k = 0;
        for(long x : simpleArr) System.out.print( x + " ");
        System.out.println();
        System.out.println((System.currentTimeMillis() - before)/1000 + "sec" );
    }

    public static boolean simple (long num){
        boolean flag = true;
        for (long i = 2; i < Math.sqrt(num) + 1; i++){
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
