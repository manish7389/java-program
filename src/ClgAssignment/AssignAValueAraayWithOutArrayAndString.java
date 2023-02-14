package ClgAssignment;

public class AssignAValueAraayWithOutArrayAndString {
public static void main(String args[]){
	StringBuffer a = new StringBuffer("12345789");
	System.out.println("a = "+a);
	System.out.println(a.insert(5,"6"));
	System.out.println("---------------------------BY ARRAY-------------------------------");
	int A[] = {1,2,3,4,5,7,8,9};
	System.out.println(A.length);
	int pos = 6;
	int element = 6;
	for(int i=A.length-1; i<pos-1; i--){
		A[i] =A[i-1];
	}
		A[pos-1] = element;
	for(int i=0; i<A.length; i++){
		System.out.print(A[i]);
	}
}
}
