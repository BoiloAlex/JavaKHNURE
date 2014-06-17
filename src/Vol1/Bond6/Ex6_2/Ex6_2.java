package Vol1.Bond6.Ex6_2;

import java.io.IOException;

/*
*в строке находится одно слово. поменять
*порядок букв на обратный
*
*/
public class Ex6_2 {
	public static void main (String[] args) throws IOException {
        byte[] b = new byte[100];
        int n = System.in.read(b);
        String s = new String(b,0, n-1);
		char[] chS = s.toCharArray();
        char temp;
        //StringBuffer revS = s.
		for(int i = 0; i <s.length()/2; i++){
            temp = chS[s.length()-i-1];
            chS[s.length()-i-1] =chS[i];
            chS[i] = temp;
        }
	    System.out.println(chS);
	}

}
