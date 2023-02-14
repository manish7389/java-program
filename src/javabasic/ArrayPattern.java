package javabasic;

public class ArrayPattern {
public static void main(String args[]){
	String[][] str=new String[5][];
	str[0]=new String[7];
	str[1]=new String[10];
	str[2]=new String[12];
	str[3]=new String[10];
	str[4]=new String[7];
	for(int r=0;r<str.length; r++){
	for(int c=0; c<str[r].length; c++){
	if(r==0 &&c<5 || r==4 &&c<5){
		str[r][c]=" ";
	}	
	else{str[r][c]="*";
	}
	if(r==2 && c==11){
		str[r][c]="M";
	}
	System.out.print(str[r][c]+" ");
	}
	System.out.println(" ");
	}
	}
	}	