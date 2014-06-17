package Vol2.Bond1.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Построить частотный словарь текста, в котором каждому трехбуквенному сочетанию
 * приписывается количество его вхождений в текст.
 * Сочетания букв,которых нет в тесте - в словарь входить не должно.
 * Текст для анализа из файла
 * текст не должен содержать пробелы и знаки препинания.
 * @author user
 */
public class DictionaryDemo {
    public static void main (String[] args) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("wANDw.txt"));
        String s = "";
        Dictionary dic = new Dictionary();
        while (sc.hasNext()){
            s = sc.next();
            dic.add(s);
        }
        dic.Print();




    }
}
