package Vol2.Bond1.Ex1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Определить класс MyString, который представляет сообой неиизменяемые строки
 * Эквивалентные с точностью до регистра символов.
 * При определении класса учестьб что его экземпляры могут использоваться как
 * ключи в Map.
 *
 * @author user
 */
public class MyStringDemo {
    public static void main(String[] args) {
        MyString ms = new MyString();
        ms.add("pn");
        ms.add("vt");
        ms.add("sr");
        ms.add("4t");
        ms.add("pt");
        ms.add("cb");
        ms.add("vs");

        Map map = new HashMap();
        for (int i = 0; i < ms.size(); i++)
            map.put(ms.push(i), i + 1);

        Set entryset = map.entrySet();
        System.out.println("Set of entries : " + entryset);
    }
}
