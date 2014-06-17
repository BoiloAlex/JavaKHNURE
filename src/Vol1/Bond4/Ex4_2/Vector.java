package Vol1.Bond4.Ex4_2;

public class Vector {
    static Object[] links = new Object[10];
    static int count = 0;

    static public boolean clear(){
        count = 0;
        return true;
    }

    static public void add(Object ob){
            if (count == links.length) {
            Object [] temp = new Object[links.length * 2];
            for(int i = 0; i < links.length; i++)
                temp[i] = links[i];
            links = temp;
        }

        links[count++] = ob;
    }

    static public Object getI (int i){
        return links[i];
    }

    static public boolean removeI (int i){
        if (i >= count || i < 0 ) return false;
        for (int k = i; k < count - 1; k++)
            links[k] = links[k+1];
        count--;
        return true;
    }
}
