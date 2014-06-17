
package Vol1.Bond7.Ex7_1;

public class StringDoubleDemo {
    public static void main(String[] args) throws AlasException {
        double res;
        String str;

        // String str ="sdfsdfsdf";
        //double d = 1.256E-5;
        //System.out.println("double String: " + d);

       /* str = "gfdgdfgd-3432.34e-10dfgdfg345fg543fdg5";
        System.out.println("Input String: " + str);
        res = 0;
        try {
            res = StringDouble.Convert(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(res);*/



        str = "gfdgdfgd+3432.34e-10dfgdfg345fg543fdg5";
        System.out.println("Input String: " + str);
        res = 0;
        try {
            res = StringDouble.Convert(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(res);


        str = "gfdgdfgd-3432.34e-10dfgdfg345fg543fdg5";
        System.out.println("Input String: " + str);
        res = 0;
        try {
            res = StringDouble.Convert(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(res);


        str = "g";
        System.out.println("Input String: " + str);
        res = 0;
        try {
            res = StringDouble.Convert(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(res);


    }
}

