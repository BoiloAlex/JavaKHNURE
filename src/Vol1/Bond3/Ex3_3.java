package Vol1.Bond3;
/*
* Создать двумерный массив символов и заполнить буквами Ч и Б в шахматном порядке
* */
public class Ex3_3 {
    public static void main (String[] args){
        String[][] chess = new String[8][8];
        int slide;
        for (int i = 0; i < 8; i++){
            if (i%2 == 0) slide = 1;
                else slide = 0;
            for(int j = 0; j < 8; j++){
                if ((j  + slide)% 2 == 0 ) chess[i][j] = "Ч";
                    else chess[i][j] = "Б";
            }
        }

        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++)
                System.out.print(chess[i][j] + " ");
            System.out.println();
        }
    }
}
