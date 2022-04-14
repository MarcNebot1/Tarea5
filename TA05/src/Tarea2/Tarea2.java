package Tarea2;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre:");
		
		String name =sc.nextLine();
		sc.close();
		
		System.out.println("Bienvenido " + name.toUpperCase());
		
	}

}
