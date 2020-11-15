package test;
import java.util.*;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Int");
		Scanner takevalue=new Scanner(System.in);
		int c =takevalue.nextInt();
		System.out.println("Enter Double");
		double d=takevalue.nextDouble();
		System.out.println("Enter String");
		String v = takevalue.nextLine();
		System.out.println(c);
		System.out.println(d);
		System.out.println(v);
		
		
	}

}
