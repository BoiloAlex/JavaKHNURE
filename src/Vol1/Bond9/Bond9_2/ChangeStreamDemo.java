package Vol1.Bond9.Bond9_2;

import java.io.IOException;

/*
*
* */
public class ChangeStreamDemo {

    public static void main(String[] args) throws IOException {
        long before = System.currentTimeMillis();
        boolean a = ChangeStream.CopyChange("wANDw.txt", "wANDw_ChangeStream.txt", "ABCDEFGHIJKLMNOPQRSTUVWXYZ","abcdefghijklmnopqrstuvwxyz");
        System.out.println("Способ копирования: байтовый. Файл скопирован? " + a + " время " + (System.currentTimeMillis() - before));

    }

}
