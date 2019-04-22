/*6. Confeccionar una clase que represente un empleado. Definir como atributos su
nombre y su sueldo. Confeccionar los métodos para la carga, otro para imprimir sus
datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo
supera a 3000).*/
import java.util.Scanner;

public class 6
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        int des=1;
        char emp;
        int sueldo=0;
        while(des==1)
        {   
        	System.out.print("Ingresar un empleado");
			emp=teclado.nextInt();
			System.out.print("Ingresar su sueldo");
			sueldo=teclado.nextInt();
			if(sueldo>=3000)
			{
				System.out.print("Su nombre es"+ emp +"y su sueldo es"+ sueldo +" y debe pagar impuestos \n");
			}else{
				System.out.print("Su nombre es"+ emp +"y su sueldo es"+ sueldo +" y no debe pagar impuestos \n");
			}
			System.out.print("1) Si desea ingresar otro empleado o 2) Si no lo desea");
			des=teclado.nextInt();
        }
    }
}