package Vol1.Bond9.Bond9_4;

import java.io.File;

public class FileExist {
    public static void ToDo(String adress) {
        File file = new File(adress);
        Print(file);
    }

    private static void Print(File file) {
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            if (list != null) {
                for (int i = 0; i < list.length; i++)
                    Print(list[i]);
            }
        } else System.out.println(file.getAbsolutePath());
    }
}
