/*8. Realizar una clase Persona que tenga como atributos el nombre y la edad. Definir
como responsabilidades un método que cargue los datos personales y otro que los
imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un
atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Crear un objeto de la clase Empleado y llamar a sus métodos.*/
import java.util.Scanner;

public class 8
{
    public static void main(String args[])
    { 
    	/*HICIMOS TODO EN UN METODO PORQUE NO SABEMOS COMO HACER OTRA CLASE QUE HEREDE DE ESTA*/
        Scanner teclado=new Scanner(System.in);
        char nom;
        int edad;
        int sueldo;
        System.out.print("Ingresar su nombre");
		nom=teclado.nextInt();
		System.out.print("Ingresar su edad");
		edad=teclado.nextInt();
		System.out.print("Ingresar su sueldo");
		sueldo=teclado.nextInt();
		System.out.print("El nombre es:"+ nombre +" y la edad es"+ edad +"y el sueldo es"+ sueldo +);
    }
}