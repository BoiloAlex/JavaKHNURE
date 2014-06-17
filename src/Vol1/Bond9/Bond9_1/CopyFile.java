package Vol1.Bond9.Bond9_1;


import java.io.*;

//*
//Создайте статрический метод для копирования файла с двумя параметрамиЖ имя оригинального файла, имя файла копии.
// Перегрузите метод для случая, когда файлы задаются не именами, а объектами java.io.File
//Сравните быстродействие буферезированых и небуферизированых методов
//
// */
public class CopyFile {

    public static boolean CopyFil(String inAd, String outAd) throws IOException {

        File pathIn = new File(inAd);
        if (!pathIn.exists() || pathIn.isDirectory()) return false;
        File pathOut = new File(outAd);
        //if (!pathOut.exists()) pathOut.createNewFile();
        InputStream is = null;
        OutputStream os = null;
        System.out.println(pathIn.getAbsolutePath());
        try {
            is = new FileInputStream(pathIn);
            os = new FileOutputStream(pathOut);
            int b;
            while ((b = is.read()) != -1)
                os.write(b);
        } catch (IOException e) {
            System.out.print("Ошибка");
            return false;
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

        return true;
    }

    public static boolean CopyReader(String inAd, String outAd) throws IOException {
        File pathIn = new File(inAd);
        if (!pathIn.exists() || pathIn.isDirectory()) return false;
        //File pathOut = new File(outAd);
        //if (!pathOut.exists()) pathOut.createNewFile();

        BufferedReader in = null;//Декоратор
        PrintWriter pw = null;
        int count = 0;
        try {
            //in = new BufferedReader(new FileReader(inAd));

            in = new BufferedReader(new InputStreamReader(new FileInputStream(inAd), "Cp1251"));
            pw = new PrintWriter(new BufferedWriter(new FileWriter(outAd)));
            String line;
            while ((line = in.readLine()) != null) {
                pw.write(line + "\n");
                //count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
            return false;
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (in != null) {
                in.close();
            }
        }
        //System.out.println(count);
        return true;
    }
}
