package ClgAssignment;

public class Calcio {

		int a=22, b=5, c;
		void add(){
		 c=a+b;
	     System.out.println("ADD = "+c);
		}
		void div(){
		 c=a/b;
	     System.out.println("DIVV = "+c);
	     }
		void diff(){
	     c=a-b;
	     System.out.println("SUB = "+c);
	     }
		void multi(){
	     c=a*b;
	     System.out.println("MULTI = "+c);
	     }
		void mod(){
	     c=a%b;
	     System.out.println("MOD = "+c);
          }
		public static void main (String args[]){
			Calcio allopt = new Calcio();
			allopt.add();
			allopt.div();
			allopt.diff();
			allopt.multi();
			allopt.mod();
		}
		}