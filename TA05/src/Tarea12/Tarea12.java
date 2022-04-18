package Tarea12;

import java.util.Scanner;

public class Tarea12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String somestring="a";
		
		  Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<=2;i++) {
				
				System.out.print("Introduce la contraseña ");
				
				String contra=sc.nextLine();
				
				if (contra.equalsIgnoreCase(somestring)){
					System.out.println("la contraseña es correcta");
					break;
				}else {
					System.out.println("la contraseña es incorrecta");
					
					
					
				}
				
			}
		
	}

}
