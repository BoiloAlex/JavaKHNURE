package Vol1.Bond7.Ex7_1;

/*
* Создать статический метод, который преобразует строку в вещественное
* число. Успешному преобразованию не должны мешать никакие символы,
* находящиеся в строке и после записи числа. Если в строке можно усмотреть
* несколько вещественных чисел, для преобразования нужно выбрать первое.
* Если преобразование невозможно, должно возбуждаться исключение типа
* AlasException. Тип AlasException определить в программе, унаследовав
* Exception.
* */
public class StringDouble {

    //static private

    public static double Convert(String str) throws AlasException {
        //int position = 0;
        String array[] = str.split("\\D+");
        if (array.length == 0)
            throw new AlasException();


        String res = "", res1 = "";

        int state = 1;
        int pos = 0;
        while (pos < str.length() || state < 20){

            //System.out.print(state + String.valueOf(str.charAt(pos))+" ");
            switch (state) {
                case 1:  print(state);
                    res = "";
                    if (isSign(pos, str))
                        state = 2;
                    if (isDigit(pos, str))
                        state = 3;
                    if (isPoint(pos, str))
                        state = 4;
                    pos++;
                    break;
                case 2: print(state);
                    res = String.valueOf(str.charAt(pos++)); //знак
                    state = 5;// после знака числор или точка
                    break;
                case 3: print(state);
                    res += String.valueOf(str.charAt(pos++));//цифра
                    state = 6;// после цифры только точка
                    break;
                case 4: print(state);
                    res += "."; //точка
                    pos++;
                    state = 7;// только цифры и точка толькo одна
                    break;
                case 5: print(state);
                    if (isSign(pos, str))
                        state = 2;//учесть, что знак должен меняться.
                    else  if (isDigit(pos, str))
                        state = 3;
                    else if (isPoint(pos, str))
                        state = 4;
                    else
                        state = 1;
                    break;
                case 6: print(state);
                    if (isDigit(pos, str))
                        state = 3;
                    else if (isPoint(pos, str))
                        state = 4;
                    else
                        state = 20;//число готово
                    break;
                case 7: print(state);
                    if (isDigit(pos, str))
                        state = 8;// после точки - дробная часть.
                    else if (isExp(pos, str))
                        state = 10;
                    else
                        state = 20;
                    break;
                case 8: print(state);
                    res += String.valueOf(str.charAt(pos++));//цифра
                    state = 9;// после цифры только e
                    break;
                case 9: print(state);
                    if (isDigit(pos, str))
                        state = 8;
                    else if (isExp(pos, str))
                        state = 10;
                    else state = 20;
                    break;
                case 10: print(state);
                    res1 += "e";
                    pos++;
                    state = 11;
                    break;
                case 11: print(state);
                    if (isSign(pos, str))// знак мантиссы
                        state = 12;
                    else  if (isDigit(pos, str))
                        state = 14;
                    else state = 15;
                    break;
                case 12: print(state);
                    res1 += String.valueOf(str.charAt(pos++));//знак мантиссы
                    state = 13;
                    break;
                case 13: print(state);
                     if (isDigit(pos, str))
                        state = 14;
                    else state = 15;
                    break;
                case 14: print(state);
                    res1 += String.valueOf(str.charAt(pos++));//степень мантиссы
                    state = 13;
                    break;
                case 15: print(state);
                    res += res1;
                    state = 20;
                    break;
                case 20:  print(state);
                    pos++;//
            }
        }
        System.out.println("\n" + res);
        return Double.parseDouble(res);
    }

    private static boolean isDigit(int pos, String str ){//проверка символа на цифру
        return str.charAt(pos) >= '0' && str.charAt(pos) <= '9';
    }

    private static boolean isPoint(int pos, String str){//Точка?
        return ((str.charAt(pos) == ',') || (str.charAt(pos) == '.'));

    }

    private static boolean isSign(int pos, String str ){
        return str.charAt(pos) == '+' || str.charAt(pos) == '-';
    }

    private static boolean isExp(int pos, String str ){
        return str.charAt(pos) == 'e' || str.charAt(pos) == 'E';
    }
    private static void print(int state){
       // System.out.print(state + " ");
    }





//    private static String rule1(int position, String str) {
//        if (position == str.length()) return null;
//
//        if (str.charAt(position) == '-' || str.charAt(position) == '+')
//            return String.valueOf(str.charAt(position));
//        else return rule1(++position, str);
//    }
//
//
//
//
// if (str.charAt(position) >47 && str.charAt(position) < 58)//цифры
//            rule2(position, str);


    //}

//    private static void rule2(int position, String str) {
//
//        if (str.charAt(position) > 47 && str.charAt(position) < 58)//цифры
//            res += String.valueOf(str.charAt(position));
//    }


//    public static double Convert(String str) throws AlasException {
//        //str = str.trim();
//        double res;
//        String sRez = "";
//        String array[] = str.split("\\D+");
//
//        if (array.length == 0)
//            throw new AlasException();
//
//        int shift = 0;
//
//        if (array[0].equals(""))
//            shift = 1;
//
////            remove(array);
//        int begin = -2;
//        if (array.length > 1)
//            begin = str.indexOf(array[shift]);
//
//        double nat;
//        //int findMinus = str.indexOf('-');
//        int findMinus = 1;
//        if (begin > 0 && str.charAt(begin - 1) == '-'){
//            findMinus = -1;
//            sRez += "-"; //
//        }
//
//
//        int findPoint = 1;
//
//        int end = -2;
//        if (array.length > 2)
//            end = str.indexOf(array[1 + shift], begin + 1);
//
//        if (end > 0 && (str.charAt(end - 1) == '.' || str.charAt(end - 1) == ',') && str.indexOf('.', begin) < end)
//            findPoint = -1;
//
//        // System.out.println("begin " + begin + " end " + end);
//        nat = Double.parseDouble(array[shift]);
//        sRez += array[shift];
//        boolean minusMantissa = false;
//
//        double nat2 = 0;
//        if (findPoint < 0){
//            nat2 = Integer.parseInt(array[1 + shift]) * Math.pow(10, (array[1 + shift].length() * (-1)));
//            sRez += "." + array[1 + shift];
//            int eLocal = end + array[1 + shift].length() + 1;
//            if (str.charAt(eLocal) == 'e' ||str.charAt(eLocal) == 'E'){
//                if (str.charAt(eLocal + 1) == '-')
//                    minusMantissa = true;
//                if (str.charAt(eLocal + 1) == '+')
//                    eLocal++;
//                if (str.charAt(eLocal))
//
//
//            }
//
//
//
//
//
//        }
//        res = nat + nat2;
//        if (findMinus < 0) {
//            res = -res;
//        }
//        res = Double.parseDouble(sRez);
//
//        return res;
//    }

//    //static private void remove(String[] arr) {
//        String[] arr1 = new String[arr.length - 1];
//        for (int i = 1; i < arr.length; i++) {
//            arr1[i - 1] = arr[i];
//        }
//        arr1 = arr;
//    }

//    static double ConvertReg(String str) throws AlasException {
//        double res = 1;
//
//        StringTokenizer strTok = new StringTokenizer(str);
//        System.out.println("next: " + strTok.nextToken(".")/* + "next: " + strTok.nextToken() + "next: " + strTok.nextToken()*/);
//
//
//        return res;
//    }


}
