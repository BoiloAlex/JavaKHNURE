package Vol1.Bond3;
/*
* Создать 6ти мерный массив с двумя значениями в каждом измерении. заполнить натуральными числами по порядку. сколько чисел получится?
* */
public class Ex3_4 {
    public static void main (String[] args){
        int [][][][][][] array6 = new int[2][2][2][2][2][2];
        int count = 0;
        for (int i1 = 0; i1 < 2; i1++)
            for (int i2 = 0; i2 < 2; i2++)
                for (int i3 = 0; i3 < 2; i3++)
                    for (int i4 = 0; i4 < 2; i4++)
                        for (int i5 = 0; i5 < 2; i5++)
                            for (int i6 = 0; i6 < 2; i6++)
                                array6[i1][i2][i3][i4][i5][i6] = ++count;
        System.out.println("сколько чисел получится? - " + count);
    }
}
