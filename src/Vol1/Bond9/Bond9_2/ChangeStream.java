package Vol1.Bond9.Bond9_2;

import java.io.*;

/*
* Скопируйте содержимое одного символьного потока в другой поток, попутно делая замену сиволов.
* В качестве таблицы символов используйте 2 строки одинаковой длины S1 и S2.
*
*
* */
public class ChangeStream {
    static String inCode;
    static String outCode;

    public static boolean CopyChange(String inAd, String outAd, String _inCode, String _outCode) throws IOException {
        inCode = _inCode;
        outCode = _outCode;
        File pathIn = new File(inAd);
        if (!pathIn.exists() || pathIn.isDirectory()) {
            System.out.println("не соблюдены условия замены. Длина входной и выходгной последовательности разные");
            return false;
        }
        if (inCode.length() != outCode.length()) {
            return false;
        }

        BufferedReader in = null;
        PrintWriter pw = null;
        try {
            //in = new BufferedReader(new FileReader(inAd));

            in = new BufferedReader(new InputStreamReader(new FileInputStream(inAd)/*, "Cp1251"*/));
            pw = new PrintWriter(new BufferedWriter(new FileWriter(outAd)));
            String line, n = System.getProperty("line.separator");

            while ((line = in.readLine()) != null) {
                line = decode(line);
                pw.write(line + n);

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
        return true;
    }

    private static String decode(String line) {
        char chTemp;
        int index;
        String stTemp = "";
        for(int i = 0 ;i < line.length(); i++){//идем по строке от начала до конца
            chTemp = line.charAt(i);            // берем символ строки
            if ((index = inCode.indexOf(chTemp))!= -1)//проверяем, надо ли его заменятью Если надо, меняем.
                stTemp += outCode.charAt(index);
            else
                stTemp += chTemp;

        }
        return stTemp;

    }

}
