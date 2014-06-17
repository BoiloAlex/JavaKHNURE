package Vol1.Bond3;
public class MasSimpleMilliard {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        long mas[] = new long [100];
        long a = (long) 1e16, i, res, j=0, r;
        while (j < 100) {
            res = (long) 0.0;
            while (res == 0) {
                a++; i = 3; r= (int) Math.sqrt(a);
                while (i < r) {
                    if ((a % 2) == 0)  break;
                    if ((a % i) == 0)  break;
                    if ((a % i) != 0)  i += 2;
                    if (i >= r)  res = 1;
                }
            }
            if (res == 1) {
                mas[((int) j)] = a;
                j++;
            }
        }
        for (i = 0; i < 100; i++) System.out.println(mas[((int) i)]);
        System.out.println((System.currentTimeMillis() - before)/1000 + "sec" );
    }




}