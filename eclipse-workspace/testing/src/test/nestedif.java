package test;
import java.util.*;
public class nestedif {
	public static void main(String[] arg) {
		System.out.println("enter 3 values");
		Scanner sc=new Scanner(System.in);
		int a,b,c,result;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		result=0;
//		if(b>c && b>a) {
//			System.out.println(b);
//			if(a>b && a>c) {
//				System.out.println(a);
//				if(c>a && c>b) {
//					System.out.println(c);
//				}
//			}
//		}
//		else {
//			System.out.println("something went wrong");
//		}
//		
//	}
//	
		result=a>b?a>c?  a : c :    b>c?  b:c;
		System.out.println("result is : " + result);
	}
}
