package variablesandopretar;

public class BitwiseOperater {
	public static void main(String args[]){
		int h = 2;
		int i = 4;
		System.out.println(Integer.toBinaryString(h));
		System.out.println(Integer.toBinaryString(h|i));//OR
		System.out.println(Integer.toBinaryString(h&i));//AND
		System.out.println(Integer.toBinaryString(h^i));//XOR
		System.out.println(Integer.toBinaryString(h<<2));//left shift
		System.out.println(Integer.toBinaryString(h>>2));//singed right shift 
		System.out.println(Integer.toBinaryString(h>>>2));//unsinged right shift 
	}

}
