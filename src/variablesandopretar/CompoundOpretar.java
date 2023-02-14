package variablesandopretar;

public class CompoundOpretar {
public static void main(String args[]){
	int a = 10;
	System.out.println("Assing Sum ="+(a+=10));//20
	System.out.println("Assing Mul ="+(a*=5));//100 a=20
	System.out.println("Assing Sub ="+(a-=20));//80 a=100
	System.out.println("Assing Div ="+(a/=4));//20 a=80
	System.out.println("Assing rem ="+(a%=2));//0 a=20
}
}
