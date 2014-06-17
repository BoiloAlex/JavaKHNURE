package Vol1.Bond9.Bond9_5;
/*
* Вывести только фалы с расширением java, txt, class.
*
*
* */

import java.io.File;

public class FileExistJAVA {
    public static void ToDo(String adress) {
        File file = new File(adress);
        Print(file);
    }

    private static void Print(File file) {
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            if (list != null) {
                for (File aList : list) Print(aList);
            }
        } else {
            String name = file.getName();
            int iName = name.length();
            int iJava = name.lastIndexOf("java");
            int iTxt = name.lastIndexOf("txt");
            int iClass = name.lastIndexOf("class");
            if (iName - 4 <= iJava || iName - 5 <= iClass || iName - 3 <= iTxt)
                System.out.println(file.getName() );
        }
    }
}
