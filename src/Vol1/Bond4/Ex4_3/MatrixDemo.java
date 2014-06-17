package Vol1.Bond4.Ex4_3;

public class MatrixDemo {
    public static void main(String[] args){
        Matrix arrA = new Matrix(4,5);
        Matrix arrB = new Matrix(4,5);
        for (int i = 0; i < arrA.array.length; i++ )
            for (int k = 0; k < arrA.array[0].length; k++){
                arrA.array[i][k] = arrB.array[i][k] = i*k + 1;
            }
        arrA.printArray();
        arrB.printArray();

        Matrix sum = arrA.sum(arrB);
        sum.printArray();

        arrA.simpleMultiplication(5);
        arrA.printArray();

        arrA.transposed();
        arrA.printArray();
    }
}
