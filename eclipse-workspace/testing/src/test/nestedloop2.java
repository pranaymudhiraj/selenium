package test;
import java.util.*;
public class nestedloop2 {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		for(;;) {
			int n=sc.nextInt();
			if(n<0) {
				System.out.println("break");
				break;
			}
			
			System.out.println(n);	
			}
	}
}
