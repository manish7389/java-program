package javabasic;

public class NestingPattern5 {
public static void main(String args[]){
	int i,j,k,l=10;
	for(i=1; i<10;i++){
		for(k=l;k>=1;k--)
			System.out.print(" ");
		l--;
		for(j=1;j<=i;j++)
			System.out.print("*");
			System.out.println("");
		
	}
}
}
