package javabasic;

public class ArrayMultiplicasion {
public static void main(String args[]){
	int table[]=new int[10];
	for(int i=0; i<10; i++){
		table[i]=2*i;
				System.out.println(table[i]);
	} 
	System.out.println("-----------------------------pattern2----------------------------------");
	int a[]=new int[11];
	for(int i=1; i<=10; i++){
	a[i]=5*i;
	System.out.println(a[i]);
	}
	System.out.println("-------------------------patern3----------------------------------------");
	int b[]=new int[11];
	int n= 5;
	for(int i=1; i<11; i++){
		System.out.println(n+"*"+i+"="+n*i);
	}
}
}
