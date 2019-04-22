/* ejercicio 3*/
import java.util.Scanner;

public class 3
{	
	public static void main (String args[])
	{
 		Scanner teclado=new Scanner(System.in);
 		int f;
 		for(f=1;f<=10;f++) {
 			System.out.print("Ingrese un numero");
			numero=teclado.nextInt();
			if((numero/2)==0)
 			{
 				System.out.print("Es par");
 			}else{
 				System.out.print("Es impar");
 			}
		}
 	}
 }
 