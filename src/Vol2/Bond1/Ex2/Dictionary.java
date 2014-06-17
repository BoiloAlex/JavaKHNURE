package Vol2.Bond1.Ex2;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    Map<String, Integer> map;

    public Dictionary() {
        map = new TreeMap<String, Integer>();

    }

    public void add(String s) {

        if (s.length() < 3) return;
        int i = 0;
        String sTemp = "";
        boolean flag = true;
        while (flag) {
            for (int j = 0; j < 3; j++)//не превышает длину строки
                if ((s.charAt(i + j) >= 65 && s.charAt(i + j) <= 90) || (s.charAt(i + j) >= 97 && s.charAt(i + j) <= 122)) {
                    sTemp = sTemp + Character.toString(s.charAt(i + j));
                    //i++;
                } else {
                    i = i + j;
                    j = 0;
                    sTemp = "";
                    if (i > s.length() - 3) break;
                }

            if (sTemp.length() == 3) {
                if (map.containsKey(sTemp))
                    map.put(sTemp, map.get(sTemp) + 1);
                else
                    map.put(sTemp, 1);
            }
            //System.out.println(sTemp + "|");
            sTemp = "";
            i++;
            if (i >= s.length() - 2)
                flag = false;
        }
    }

    public void Print() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("size " + map.size());

    }
}



