package test;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("chossen case 1");
			break;
		case 2:
			System.out.println("chossen case 2");
			break;
		default:
			System.out.println("something went wrong");
		}
	}

}
