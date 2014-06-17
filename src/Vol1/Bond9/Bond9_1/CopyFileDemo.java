package Vol1.Bond9.Bond9_1;

import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        long before = System.currentTimeMillis();
        boolean a = CopyFile.CopyFil("wANDw.txt", "wANDw1.txt");
        System.out.println("Способ копирования: байтовый. Файл скопирован? " + a + " время " + (System.currentTimeMillis() - before));

        before = System.currentTimeMillis();
        boolean b = CopyFile.CopyReader("wANDw.txt", "wANDw2.txt");
        System.out.println("Способ копирования: символьный. Файл скопирован? " + b + " время " + (System.currentTimeMillis() - before));
    }
}
