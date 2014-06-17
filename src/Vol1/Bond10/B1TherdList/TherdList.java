package Vol1.Bond10.B1TherdList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* оБъединение двух списков
* пересеченеи
* разность
*
* */
public class TherdList {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<Integer> list1 = new ArrayList<Integer>(10);
        List<Integer> list2 = new ArrayList<Integer>(15);
        Integer temp;
        for (int i = 0; i < 10; i++) { //Заполнение List1
            temp = rnd.nextInt(20);
            list1.add(temp);
            // System.out.print(list1.get(i) + " ");
        }

        for (int i = 0; i < 15; i++) {//Заполнение List2
            list2.add(i, (rnd.nextInt(20)));
        }

        Print(list1, "list1");
        Print(list2,"list2");
        //объединение
        List<Integer> listSum = new ArrayList<Integer>((list1.size() + list2.size()));
        int i;
        for (i = 0; i < list1.size(); i++) listSum.add(list1.get(i));
        for (int j = 0; j < list2.size(); i++, j++) listSum.add(list2.get(j));
        Print(listSum, "listSum");

        //пересечение
        List<Integer> listCross = new ArrayList<Integer>((list1.size() < list2.size() ? list1.size() : list2.size()));
        for (i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++)
                if (list1.get(i).equals(list2.get(j)))
                    listCross.add(list1.get(i));
        }
        Print(listCross, "listCross");

        List<Integer> listSub = new ArrayList<Integer>((list1.size() < list2.size() ? list1.size() : list2.size()));
        for (i = 0; i < list1.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < list2.size(); j++)
                if (list1.get(i) == list2.get(j))
                    flag = false;
            if (flag) listSub.add(list1.get(i));
        }
        Print(listSub,"listSub" );
    }

    private static void Print(List<Integer> list, String name) {

        System.out.println(" \tlist " + list.size() + " элементов : " + name);
        for (Object aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
    }
}
