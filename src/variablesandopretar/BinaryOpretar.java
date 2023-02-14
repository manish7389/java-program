package variablesandopretar;

public class BinaryOpretar {
	public static void main(String args[]){
int a = 0;
int b = 2+ a++;
System.out.println("a="+a);
System.out.println("b="+b);
int c = 0;
int d = 2+ ++c;
System.out.println("c="+c);
System.out.println("d="+d);
System.out.println("--------------------binary opretar--------------------------");
int res = 80/3+100%2-40+50*2+60%4-50/3;
System.out.println("res ="+res);
}
}
