package Vol1.Bond8.Bond8_2;

/**
 * Created by студент on 19.05.2014.
 */
        import java.math.BigDecimal;
        import java.math.RoundingMode;

/*
*Создать класс целый массив, который хранит свои данные в массиве
* а) реализовать  в нем интерфейс "Инверсия"
* б) Обьявить интерфейс "усреднение", состоящий из функции "среднее арифметическое" и "медиана". реализовать его в
* классе целый массив наряду с интерфейсом "иныверсия".
*
*
* */
public class WholeArray implements Inversion {
    int count;
    double[] array;

    public WholeArray(int count) {
        this.count = 0;
        array = new double[count * 2];
    }

    public void Add(double add) {
        if (count == array.length) {
            double[] temp = new double[count * 2];
//           temp = array.clone();
            for (int i = 0; i < count; i++)
                temp[i] = array[i];
            array = temp;
        }
        array[count++] = add;
    }

    public void Print() {
        for (int i = 0; i < count; i++) System.out.printf(array[i] + ",  ");
        System.out.println();
    }

    @Override
    public void Inversion() {
        double temp;
        for (int i = 0; i < count / 2; i++) {
            temp = array[i];
            array[i] = array[count - i - 1];
            array[count - i - 1] = temp;
        }
    }

    private double [] SplitArray(double[] tempArray){
        double[] temp = new double[count];
        for (int i = 0 ; i < count; i ++)
            temp [i] = tempArray[i];
        return temp;
    }

    public double AtichmeticMidl(){
        MidRealisation mr = new MidRealisation( SplitArray(this.array));////
        return mr.AtichmeticMidl();
    }

    public double Mediana(){
        MidRealisation mr = new MidRealisation(SplitArray(this.array));
        return mr.Mediana();
    }

    public class MidRealisation implements Mid {

        double[] array;

        public MidRealisation (double[] array){
            this.array = array;
        }

        @Override
         public double AtichmeticMidl() {
            double sum = 0;
            for (double x : array) sum += x;
            sum = new BigDecimal(sum / count).setScale(3, RoundingMode.UP).doubleValue();
            return sum;
        }

        @Override
        public double Mediana() {
            double[] temp = new double[count];
            for (int i = 0; i < count; i++)
                temp[i] = array[i];
            Sort(temp, count);
            //for (double x : temp) System.out.print(x + " ");
            double med;
            //System.out.println("temp.length " + temp.length + ", temp.length / 2 " + temp.length / 2);
            if (temp.length % 2 != 0)
                med = temp[temp.length / 2];
            else med = (temp[temp.length / 2] + temp[temp.length / 2 - 1]) / 2;
            // med = new BigDecimal(med).setScale(3, RoundingMode.UP).doubleValue();
            return med;
        }

        private void Sort(double[] arr, int length) {
            double temp;
            for (int i = 0; i < length - 1; i++) {
                for (int j = length - 1; j > i; j--) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }

        }
    }

}
