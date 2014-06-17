package Vol1.Bond7.Ex7_3_ToDo;

import java.io.IOException;

/*
*даны два слова, каждое в отдельной строке.
*распечатать те буквы, которые есть в одном слове,
но нет в другом.
*/
public class Ex6_3_simbols {
	public static void main (String[] args) throws IOException {
		byte[] b = new byte[100];
        int n = System.in.read(b);
        String s1 = new String(b,0, n-1);
		n = System.in.read(b);
        String s2 = new String(b,0, n-1);
        String result = "";


        boolean flag;
        for (int i = 0; i < s1.length(); i++){
            flag = false;
            for  (int j = 0; j < s2.length(); j++)
                if (s1.charAt(i)==s2.charAt(j)) flag = true;
            if (flag) result +=s1.charAt(i);
        }

        System.out.println(result);

	}

}
