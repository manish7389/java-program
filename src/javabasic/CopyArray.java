package javabasic;
public class CopyArray {
public static void main(String args[]){
char[]source={'R','A','Y','S','T','E','C'};
char des[]=new char[5];
des[0]='A';
System.arraycopy(source,3,des,1,4);
System.out.println(des);
}
}
