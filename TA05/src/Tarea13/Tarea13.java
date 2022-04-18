package Tarea13;

import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {
		
		
		
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce un num entero: ");
			
			String num=sc.nextLine();
			Integer numero1=Integer.parseInt(num);
			
            System.out.print("Introduce el signo aritmetico: ");
			
            String signo=sc.nextLine();
			
            System.out.print("Introduce un num entero: ");
			
			String numero=sc.nextLine();
			Integer numero2=Integer.parseInt(numero);
	
			switch(signo) {
			   case "+":
				   int suma=numero1+numero2;
				   System.out.println("suma: "+suma);
				   break;
			   case "-":
				   int resta=numero1-numero2;
				   System.out.println("resta: "+resta);
				   break;
			   case "*":
				   int multi=numero1*numero2;
				   System.out.println("multi: "+multi);
				   break;
			   case "/":
				   int div=numero1/numero2;
				   System.out.println("diviso: "+div);
				   break;
			   case "^":
				   int exp=(int) Math.pow(numero1, numero2);
				   System.out.println("exponencial: "+exp);
				   break;
			   case "%":
				   int modul=numero1%numero2;
				   System.out.println("el modul es: "+modul);
			   default:
		
			}
	
	
	}

}
