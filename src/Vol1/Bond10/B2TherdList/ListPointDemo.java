package Vol1.Bond10.B2TherdList;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
* Создать множество точек xy, в котором точки будут распологаться в порядке удаленности от центра координат
* */

 public class ListPointDemo {
    public static void main(String[] args) {

        Set<Point> set;
        set = new TreeSet<Point>();
        Random rnd = new Random(5);
        int n = 10;
        for (int i = 0; i < n; i++)
            set.add(new Point(rnd.nextDouble()*5, rnd.nextDouble()*5));
//        for (int i = 0; i < set.size(); i ++){
//            System.out.print(set.)
//        }
        for (Point aSet : set) {
            System.out.println(aSet);
        }



    }
}
