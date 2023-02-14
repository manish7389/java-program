package javabasic;

import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d);
	//date to milli second
	long milli=d.getTime();
	long year = (1*1000*60*60*24*365l);
	System.out.println(milli);
	//milli second to date
	Date d1 = new Date(milli+year);
	System.out.println(d1);
}
}
