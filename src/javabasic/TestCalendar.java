package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
public static void main(String args[]) throws ParseException{
Calendar c = Calendar.getInstance();
System.out.println(c);
int cy = c.getWeekYear();
String bdate = "07/07/1997";
SimpleDateFormat sdgf = new SimpleDateFormat("dd/MM/yyyy");
System.out.println(bdate);
Date d = sdgf.parse(bdate); 
c.setTime(d); // set the date to get calendar
int by = c.getWeekYear();
System.out.println("cy:\t"+cy);
System.out.println("by:\t"+by);
int age = cy-by;
System.out.println("age :"+age);
}
}
