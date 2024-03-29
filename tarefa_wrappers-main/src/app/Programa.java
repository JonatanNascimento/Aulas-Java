package app;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		Integer y = x;
		
		System.out.println(y);
		
		System.out.print("Digite um numero: ");
		
		double a = sc.nextFloat();
		
		float b = (float) a;
		
		System.out.println(b);
		
		sc.close();
	}

}
