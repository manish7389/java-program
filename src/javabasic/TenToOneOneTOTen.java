package javabasic;

public class TenToOneOneTOTen {
	public static void main(String[] args) {
		int i,j=10;
		for(i=1; i<=20; i++){
			if(i<=10){
				System.out.println(i);
			}
			else{
				System.out.println(j);
				j--;
			}
		}
	}

}
