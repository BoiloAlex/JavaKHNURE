package Vol1.Bond10.B3Many;
/*
* имеется отсортированное множество строк и 2 сторки s1<s2
* из множества выделить отрезки :
* a) [s1,s2)
* b) [s1,s2]
* c) (s1,s2)
*
* */
public class StringMany  implements Comparable{
    String str;

    public StringMany(String str){
        this.str = str;
    }

    @Override
    public int compareTo(Object o) {
        StringMany strTemp= (StringMany) o;
        return this.str.compareTo(strTemp.str);
    }
}