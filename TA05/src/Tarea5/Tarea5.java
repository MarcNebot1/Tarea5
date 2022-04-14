package Tarea5;

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero: ");
		
		String num=sc.nextLine();
		int numero= Integer.parseInt(num);
		
		if(numero%2==0) {
			System.out.println("divisible entre 2 ");
		}else {
			System.out.println("no divisible entre 2 ");
		}
		
	
		sc.close();
	
	}

}
