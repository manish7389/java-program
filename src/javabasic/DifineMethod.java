package javabasic;

public class DifineMethod {
	public static void printAll(String args[]) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("hello:" + args[i]);
		}
	}

	public static void main(String args[]) {
		printAll(args);
	}

}
