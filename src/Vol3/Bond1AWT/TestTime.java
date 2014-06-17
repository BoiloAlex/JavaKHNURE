package Vol3.Bond1AWT;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Боило Александр on 14.06.2014.
 */
public class TestTime {
    public static void main (String[] args){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        System.out.println("Report Date: " + reportDate);
    }
}
