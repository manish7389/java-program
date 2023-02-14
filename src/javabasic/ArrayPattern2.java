package javabasic;

public class ArrayPattern2 {
public static void main(String args[]){
	String str[][]=new String[5][12];
	str[0]=new String[7];
	str[1]=new String[10];
	str[2]=new String[12];
	str[3]=new String[10];
	str[4]=new String[7];
	for(int r=0; r<str.length; r++){
		for(int c=0; c<str[r].length;c++){
			System.out.print("*"+" ");
		}
		System.out.println( );
	}
}
}
