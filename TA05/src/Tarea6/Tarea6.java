package Tarea6;

import java.util.Scanner;

public class Tarea6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce el precio: ");
			
			String precio=sc.nextLine();
			float prec= Float.parseFloat(precio);
			
			float preciofinal=(prec*121)/100;
			
			System.out.println(preciofinal);
			
			sc.close();
	}

}
