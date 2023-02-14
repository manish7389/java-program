package javabasic;

public class Array2D {
public static void main(String args[]){
	int[][] t2={{1,2,3},{3,4,5,6},{4,5,6,7,8,9}};
	for(int r=0; r<t2.length; r++){
		for(int c=0; c<t2[r].length; c++){
			int val = t2[r][c];
			System.out.print(val+" ");
		}
		System.out.println( );
	}
}
}
