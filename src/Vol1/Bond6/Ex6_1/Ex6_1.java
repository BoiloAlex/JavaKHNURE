package Vol1.Bond6.Ex6_1;

import java.io.IOException;

/*
* Ввести предложение с клавиатурыю Заменить все вхождения
*одного слова в предложении другим словом.
* */
public class Ex6_1 {
    public static void main (String[] args) throws IOException{
        byte[] b = new byte[100];
        int n = System.in.read(b);
        String s = new String(b,0, n-1);
		n = System.in.read(b);
		String sFind = new String(b,0, n-1);
		n = System.in.read(b);
		String sPaste = new String(b,0, n-1);
		String sNew = "";
		int input = 1;
		int count = 0;
        char[] chS = s.toCharArray();
		while (input !=-1){
			input = s.indexOf(sFind);
			if (input < 0 || input > s.length()) input = -1;
			else{
			for (int i = count; i < input; i++){

                sNew += chS[i];
                }
			sNew += sPaste;
			count += sFind.length();
			}
		}

        System.out.println(sNew);

    }
}
