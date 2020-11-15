package test;
import java.util.*;
public class caluculator {
	public static void main(String[] args) {
		System.out.println("enter value");
		Scanner sc=new Scanner(System.in);
		int a,b,result;
		a=sc.nextInt();
		b=sc.nextInt();
		result=0;
		System.out.println("operation to be performed ");
		char c = sc.next().charAt(0);
		switch (c) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '/':
			result=a/b;
			break;
		case '*':
			result=a*b;
			break;			
		}
		System.out.print(result);	
	}
	

}
