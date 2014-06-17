package Vol1.Bond3;
/*
* Разместить в памяти массив из 20 элементов и заполнить рядом Фибоначчи.
* */
public class Ex3_1 {
    public static void main (String[] args){
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 20 ; i ++){
            arr[i] = arr[i-1]+ arr[i-2];
        }
        for (int x : arr) System.out.print(x + " ");
    }
}
