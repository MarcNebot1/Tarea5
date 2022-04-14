package Tarea4;

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {
	

		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		
		String radio=sc.nextLine();
		double rad= Double.parseDouble(radio);
		
	double area=Math.PI * (Math.pow(rad,2));
		sc.close();
		
		System.out.println(area);
	}

}
