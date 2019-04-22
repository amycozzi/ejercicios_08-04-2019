/*5.Realizar un programa que acumule (sume) valores ingresados por teclado hasta
ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor
a cero.*/
import java.util.Scanner;

public class 5
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        int num=0;
        int suma=0;
        while(num<9999)
        {
        	System.out.print("Ingresar un numero");
			num=teclado.nextInt();
			suma=suma+num;
        }
        if(num==0)
        {
        	System.out.print("El valor es"+ num + "\n");
        }
        if(num<0)
        {
        	System.out.print("El valor es"+ num + "y es menor a 0");	
        }
        if(num>0)
        {
        	System.out.print("El valor es"+ num + "y es mayor a 0");	
        }
    }
}