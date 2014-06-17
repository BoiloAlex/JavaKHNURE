package Vol1.Bond6;

import java.util.Random;

/*
* Дан массив строк Упорядочить строки в массиве по алфавиту
* */
public class Ex6_4_StringArray {
    static public void main  (String[] args){
        int n = 20;
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++){
          str[i] = getSimbols();
        }
        for (String x: str) System.out.print( x + " ");
        System.out.println();
        String temp;
        for(int i = str.length-1 ; i > 0 ; i--)
            for(int j = 0 ; j < i ; j++){
                if (str[j].compareTo(str[j+1])>0) {
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }

        //Arrays.sort(str);
        for (String x: str) System.out.print( x + " ");


        }
    public static String getSimbols(){
        Random  rnd = new Random();
         String result;
       // char s = (char) (byte)(60 +  rnd.nextInt(23));
        result = Character.toString((char) (byte)(65 +  rnd.nextInt(23))) +  Character.toString((char) (byte)(97 +  rnd.nextInt(23)))+
                Character.toString((char) (byte)(97 +  rnd.nextInt(23)));
        return result ;
    }
}
