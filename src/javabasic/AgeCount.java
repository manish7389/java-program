package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeCount {
public static void main(String[] args) throws ParseException{
	Date d = new Date();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	long milli1 = d.getTime();
	System.out.println(milli1);
	String bd = "07/07/1997";
	Date bdate = sdf.parse(bd);
	long milli2 = bdate.getTime();
	System.out.println(milli2);
	int cy= d.getYear();
	int by= bdate.getYear();
int age = cy-by;
System.out.println("my age="+age);
}
}
