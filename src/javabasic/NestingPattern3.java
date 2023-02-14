package javabasic;

public class NestingPattern3 {
public static void main(String[] args) {
	int r,c;
	for(r=1; r<=5; r++){
		for(c=5; c>=r; c--){
			System.out.print(r+" ");
		}
		System.out.println(" ");
	}
	
}
}
