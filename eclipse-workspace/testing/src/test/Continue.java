package test;

import java.util.Scanner;

public class Continue {
	public static void main(String[] arg) {
		for(int i=1; i<100;i=i+1) {
			if(i>40 && i<90) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
