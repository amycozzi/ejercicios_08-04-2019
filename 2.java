/* ejercicio 2*/

import java.util.Scanner;

public class 2
{	
	public static void main (String args[])
	{
		Scanner teclado=new Scanner(System.in);
		int num;
		System.out.print("Ingresar un numero positivo");
		num=teclado.nextInt();
		if(num<10 && num>=0){
			System.out.print("El numero tiene 1 sola cifra")
		}
		if(num>=10 && num<100){
			System.out.print("El numero tiene 2 cifras");
		}
		if (num>=100 && num<1000){
			System.out.print("El numero tiene 3 cifras");
		}
		if (num>=1000 && num<10000){
			System.out.print("El numero tiene 4 cifras");
		}else{
			System.out.print("El numero tiene mas de 4 cifras");
		}
	}
}