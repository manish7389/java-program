package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDate {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str= sdf.format(d);
	System.out.println(str);
	System.out.println("---------------------------------parse-------------------------------");
	String bd="12/08/1999";
	//string to date
	Date bdate = sdf.parse(bd);
	System.out.println(bdate);
	int cy = d.getYear();
	int by = bdate.getYear();
	int age = cy-by;
	System.out.println("age :   "+age);
}
}
