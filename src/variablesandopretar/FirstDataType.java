package variablesandopretar;

public class FirstDataType {
public static void main(String[] args) {
	System.out.println("Size in Byte :"+ Integer.BYTES);
	System.out.println("Size in Bits :"+Integer.SIZE);
	System.out.println("Max Range :"+Integer.MAX_VALUE);
	System.out.println("Min Range :"+Integer.MIN_VALUE);
	int n1 = 5;
	int n2 = n1;
	System.out.println("N1="+n1 +",N2="+n2);
	n2 = n2+5;
	System.out.println("N1="+n1 +",N2="+n2);
	//reference copy
	StringBuffer sb = new StringBuffer("This");
	StringBuffer sb1 = sb;
	System.out.println("SB="+sb+",SB1="+sb1);
	sb1.append(" IS JAVA");
	System.out.println("SB="+sb+",SB1="+sb1);
	Object ob = new String();
	System.out.println(ob instanceof StringBuffer);
	int a = 5;
	int b = 6;
	int res =-(a+b);
	System.out.println(res);
	boolean c = false;
	System.out.println(!c);
	int d = 2;
	System.out.println(Integer.toBinaryString(d));
	System.out.println(Integer.toBinaryString(~d));
}
}
