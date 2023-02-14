package javabasic;

public class StringProgram {
public static void main(String[] args) {
	String name = "Vijay Dinanath Chauhan";
	System.out.println("1.String length-"+name.length());
	System.out.println("2.7 th character-"+name.charAt(6));
	System.out.println("3.Dina index is-"+name.indexOf("Dina"));
	System.out.println("4.First i position-"+name.indexOf("i"));
	System.out.println("5.a is replaced by b-"+name.replace("a","b"));
	System.out.println("6. All a is replace by b-"+name.replaceAll("a","b"));
	System.out.println("7.chhota vijay-"+name.toLowerCase());
	System.out.println("8.bada vijay-"+name.toUpperCase());
	System.out.println("9.start with viajy-"+name.startsWith("Vijay"));
	System.out.println("10.End with han-"+name.endsWith("han"));
	System.out.println("11.substring-"+name.substring(6));
}
}