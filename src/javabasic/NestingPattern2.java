package javabasic;

public class NestingPattern2 {
	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++){
			for(j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("-----------pattern3-------------");
		for(i=1; i<=5; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println(" ");
			}
		
	}

}
 