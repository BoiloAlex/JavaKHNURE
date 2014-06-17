package Vol1.Bond3;
/*
* создать теугольнй массив из 10 строк и заполнить его биномиальными коэффициентоми(треугольник Паскаля)
* */
public class Ex3_5 {
    public static void main(String[] args){
        int[][] trianglArray = new int[10][];
        for (int i = 0; i < 10; i++)
            trianglArray[i] = new int[i+1];
        fillTheArray(trianglArray);
        printArr(trianglArray);

    }
    public static void fillTheArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j == 0 || j == arr[i].length - 1)
                    arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }
    }

    public static void printArr(int [][] arr){
        String s = "";
        maxCountLengthSimbol = countLengthSimbol(arr[arr.length-1]);
        for (int i = 0; i < arr.length; i++){
            s = SpaceOne(i,arr);
            System.out.print(s);
            for (int j = 0; j < arr[i].length; j++ )
                System.out.print(arr[i][j] + "  ");
            System.out.println();
            s = "";
        }
    }

    static int maxCountLengthSimbol;
    private static String SpaceOne(int i, int [][] arr) {
        int count = countLengthSimbol(arr[i]);
        int otstup = (maxCountLengthSimbol - count)/2;
        String s = "";
        for (int k = 0; k <= otstup; k++)
            s += " ";
        return s;
    }

    private static int countLengthSimbol(int[] arr){
        int count = 0;
        for (int l = 0; l < arr.length; l++){
            int temp = arr[l];
            while (temp <0){
                count ++;
                temp = temp /10;
            }
            count +=2;
        }
        count -= 2;
        return count;
    }
}
