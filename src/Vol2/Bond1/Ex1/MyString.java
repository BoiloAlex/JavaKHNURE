package Vol2.Bond1.Ex1;


import java.util.ArrayList;
import java.util.List;

/**
 * Определить класс MyString, который представляет сообой неиизменяемые строки
 * Эквивалентные с точностью до регистра символов.
 * При определении класса учестьб что его экземпляры могут использоваться как
 * ключи в Map.
 *
 * @author user
 */
public class MyString {
    public String Day;
    private List<String> list = new ArrayList<String>();//Set!!!

    public void add(String str) {
        list.add(str);
    }

    public String push(int i) {
        return list.get(i);
    }

    public int size() {
        return list.size();
    }


}

