/*7. Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular
su suma, resta, multiplicación y división, cada una en un método, imprimir dichos
resultados.*/
import java.util.Scanner;

public class 7
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        int num1=0;
        int num2=0;
        int suma;
        int resta;
        int multi;
        int div;
        System.out.print("Ingresar un numero");
		num1=teclado.nextInt();
		System.out.print("Ingresar otro numero");
		num2=teclado.nextInt();
		suma=num1+num2;
		System.out.print("La suma es:"+ suma +"\n");
		resta=num1-num2;
		System.out.print("La resta es:"+ resta +"\n");
		multi=num1*num2;
		System.out.print("La multiplicación es:"+ multi +"\n");
		div=num1/num2;
		System.out.print("La division es"+ div +"\n");
    }
}
