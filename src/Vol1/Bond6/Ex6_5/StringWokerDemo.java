package Vol1.Bond6.Ex6_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Ввести предложение с клавиатуры, разобрать его на отдельные слова и напечатаь в столбец.
* Словом считать последоовательность букв ограниченых пробелами, знаками препинания, началои концом строки.
* Для решения - отдельный класс, принимающий строку.
* */
public class StringWokerDemo {
    public static void main (String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringWoker str = new StringWoker(reader.readLine());
        str.disassemled();
        str.print();

    }

}
