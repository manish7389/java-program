package variablesandopretar;

public class LogicalOpretar {
public static void main(String args[]){
	System.out.println("--------------------For And----------------");
	//And
	int f = 0;
	boolean g = (2<3) && (0<f++);
	System.out.println("g = "+g);
	System.out.println("f = "+f);
	       //true true = true
	       //false true = false
        	//true false = false
        	//false false = false
	System.out.println("--------------------For Or----------------");
	//Or
	int a = 0;
	boolean b = (3<4) || (0<=f++);
	System.out.println("b = "+b);
	System.out.println("a ="+a);
	     //true true = true
		 //false true = true
		 //true false = true
		 //false false = false
}
}
