package Tarea10;

import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {
		

		  Scanner sc = new Scanner(System.in);
			
			System.out.print("Numero de ventas a introducir: ");
			
			String numventas=sc.nextLine();
			int numvent=Integer.parseInt(numventas);
			
			float guardar=0;
			int i=1;
			while(i<=numvent) {
				
				System.out.print("Venta "+i+" :");
				String venta=sc.nextLine();
				float vent=Float.parseFloat(venta);
				
				
				 guardar=guardar+vent;
				
				i++;
			}
			System.out.println("la suma de les ventes es: "+guardar);
	}

}
