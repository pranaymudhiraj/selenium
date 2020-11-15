package test;

import java.util.Scanner;

public class simpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter intrest");
		float i=sc.nextFloat();
		System.out.println("enter rate");
		float f=sc.nextFloat();
		System.out.println("enter the time");
		int s=sc.nextInt();
		float result=i*f*s/100;
		int x=(int)result;
		System.out.println(result);
		
	}

}
