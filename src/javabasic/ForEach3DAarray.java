package javabasic;

public class ForEach3DAarray {
public static void main(String[] args) {
	int[][][]t3=new int[5][5][5];
	for(int t2[][]:t3){
		for(int t1[]:t2){
			for(int v:t1){
				System.out.print(v+" ");
			}
			System.out.println( );
		}
	System.out.println( );
}
}
}
