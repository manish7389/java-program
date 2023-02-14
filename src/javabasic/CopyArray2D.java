package javabasic;

public class CopyArray2D {
public static void main(String args[]){
	int[][] table= new int[5][5];
	for(int i=0; i<5; i++){
		for(int c=0; c<5; c++){
			table[i][c]=i*c;
			System.out.print(table[i][c]+" ");
		}
		System.out.println( );
	}
}
}
