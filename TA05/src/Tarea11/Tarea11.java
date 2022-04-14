package Tarea11;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce el dia: ");
			
			String dia=sc.nextLine();
			
		switch(dia) {
		   case "lunes":
			   System.out.println("Dia laboral");
			   break;
		   case "martes":
			   System.out.println("Dia laboral");
			   break;
		   case "miercoles":
			   System.out.println("Dia laboral");
			   break;
		   case "jueves":
			   System.out.println("Dia laboral");
			   break;
		   case "viernes":
			   System.out.println("Dia laboral");
			   break;
		   case "sabado":
			   System.out.println("Dia no laboral");
			   break;
		   case "domingo":
			   System.out.println("Dia no laboral");
		   default:
	
		}
	}
}
