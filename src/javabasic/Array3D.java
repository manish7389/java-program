package javabasic;

public class Array3D {
public static void main(String[] args) {
	int[][][]t3=new int [5][5][5];
	for(int t=0;t<5;t++){
		System.out.println("table no"+(t+1));
		for(int r=0;r<5;r++){
			for(int c=0;c<5;c++){
				t3[t][r][c]=c*t;
				System.out.print(t3[t][r][c]+" ");
			}
			System.out.println( );
		}
		System.out.println( );
	}
}
}
