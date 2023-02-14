package javabasic;

public class DifineMethod3 {

	public static int Sum(int i, int j) {
		double s = i + j;
		return(int) (s);
	}
	public static int Division(int i,int j){
		double d =i/j;
		return(int)(d);
	}
	public static int Multi(int i,int j){
		double m =i*j;
		return(int)(m);
	}
	public static int Substraction(int i,int j){
		double sub =i-j;
		return(int)(sub);
	}
	public static int Mod(int i, int j){
		double mod=i%j;
		return(int) (mod);
	}
	public static void main(String[] args) {
		int s=Sum(10, 20);
		int d=Division(20, 10);
		int m=Multi(10, 20);
		int sub=Substraction(10, 20);
		int mod=Mod(10, 20);
		System.out.println("sum is :"+s);
		System.out.println("div is :"+d);
		System.out.println("mul is :"+m);
		System.out.println("sub is :"+sub);
		System.out.println("mod is :"+mod);
	}

}
