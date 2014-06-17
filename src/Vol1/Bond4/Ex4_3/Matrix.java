package Vol1.Bond4.Ex4_3;

public class Matrix {
    double[][] array ;

    public Matrix(int a, int b){
       array = new double[a][b];
    }

    public Matrix sum(Matrix ob){
        if (this.array.length != ob.array.length || this.array[0].length != ob.array[0].length)
            return null;

        Matrix temp  = new Matrix(ob.array.length , ob.array[0].length);
        for  (int i = 0; i < ob.array.length; i++)
            for (int k = 0; k < ob.array[0].length; k++)
                temp.array[i][k] = this.array[i][k] + ob.array[i][k];
        return temp;
    }

    public void simpleMultiplication(double x){
        for (int i = 0; i < this.array.length; i++)
            for (int k = 0; k < this.array[i].length; k++)
                array[i][k] *= x;
    }

    public Matrix arrayMultiplicate(Matrix ob){
        if (this.array.length == ob.array[0].length) return null;
        Matrix temp = new Matrix(this.array.length, ob.array[0].length);

        for (int i = 0; i < this.array.length; i++)
            for (int k = 0; k < ob.array[i].length; k++){
                temp.array[i][k] = 0;
                for (int l = 0; i < this.array[0].length; l++)
                    temp.array[i][k] += this.array[i][l] * ob.array[l][k];
            }
        return temp;
    }

    public Matrix transposed(){
        Matrix temp = new Matrix(this.array[0].length, this.array.length);
        for (int i = 0; i < this.array.length; i++ )
            for (int k = 0; k < this.array[0].length; k++)
                temp.array[k][i] = this.array[i][k];
        return temp;
    }

    public void printArray(){
        System.out.println("---    ---");
        for (int i = 0; i < this.array.length; i++ ){
            for (int k = 0; k < this.array[0].length; k++)
                System.out.print(array[i][k] + " ");
            System.out.println();
        }

    }
}
