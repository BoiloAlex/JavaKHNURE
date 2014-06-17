package Vol1.Bond8.Bond8_2;

import java.util.Random;

public class WholeArrayDemo {
    public static void main (String[] args){
        WholeArray wa = new WholeArray(5);
        Random rnd = new Random();
        double result;
        int n = 45;
        for (int i = 0 ; i < n; i ++){
            //result = new BigDecimal(rnd.nextDouble() * 50).setScale(0, RoundingMode.UP).doubleValue();
            result = Math.round(rnd.nextDouble() * 5000)/100;
            wa.Add(result);
        }
        wa.Print();

        System.out.println(" AtichmeticMidl = " + wa.AtichmeticMidl());
        System.out.println(" Mediana = "+ wa.Mediana());
        wa.Inversion();
        wa.Print();
        System.out.println(" Mediana = "+ wa.Mediana());


    }

}
