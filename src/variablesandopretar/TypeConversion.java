package variablesandopretar;

public class TypeConversion {
public static void main(String args[]){
	int i = 20;
	double div = (double) i/3;//explicit type casting
	double div1 = i/3.0;//mixing 
	System.out.println("Div :"+div);
	System.out.println("Div1 :"+div1);
}
}
