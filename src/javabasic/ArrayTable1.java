package javabasic;

public class ArrayTable1 {
	public static void main(String[] args) {
		String str[][]=new String[10][10];
		for(int i=1; i<=10; i++){
			for(int j=2; j<=10; j++){
				System.out.print(i*j+"\t");
			}
			System.out.println(" ");
		}
	}

}
