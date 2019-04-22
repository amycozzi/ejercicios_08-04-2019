/* ejercicio 1*/
import java.util.Scanner;

public class 1
{	
	public static void main (String args[])
	{
		Scanner teclado=new Scanner(System.in);
		int precio; 
		int cant;
		int total;
		System.out.print("Ingresar el precio de su producto");
	    precio=teclado.nextInt();
		System.out.print("Ingresar la cantidad");
		cant=teclado.nextInt();
		total=precio*cant;
		System.out.print(total);
	}
}