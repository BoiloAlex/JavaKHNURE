package Vol1.Bond7.Ex7_3_ToDo;

public class StringWoker {
    String stroka;
    String[] arrStroka;
    int countSlov = 0;
    public StringWoker(String str){
        stroka = str;
    }
    public void disassemled(){
        int count = 1;
        int i = 0;
        while (i < stroka.length()){
            if(' ' == stroka.charAt(i))
                count++;
            i++;
        }
        arrStroka = new String[count];
        String stTemp = new String(stroka);
        int end;

        for (int j =  0; j < count; j++){
            end  = stTemp.indexOf(' ');
			if (end >0){
                String slovo = stTemp.substring(0, end);
                arrStroka[j] = slovo;
				System.out.println(end + "^ "+arrStroka[j]);
                String temp = stTemp.substring(end +1,stTemp.length());
                stTemp = temp;
                countSlov++;
				}
			else arrStroka[countSlov++] = stTemp ;
        }
        
    }

    public void print(){
        for (int i =0 ; i <countSlov; i++){
            System.out.println(arrStroka[i]);
        }

    }
}