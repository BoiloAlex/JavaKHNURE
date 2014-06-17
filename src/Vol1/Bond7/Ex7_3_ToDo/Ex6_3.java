package Vol1.Bond7.Ex7_3_ToDo;

import java.io.IOException;

/*
*даны два слова, каждое в отдельной строке.
*распечатать те буквы, которые есть в одном слове,
но нет в другом.
*/
public class Ex6_3 {
	public static void main (String[] args) throws IOException {
		byte[] b = new byte[100];
        int n = System.in.read(b);
        String s1 = new String(b,0, n-1);
		n = System.in.read(b);
        String s2 = new String(b,0, n-1);
	}
}
