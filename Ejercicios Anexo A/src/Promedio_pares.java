import java.util.Random;
import java.util.Scanner;

public class Promedio_pares {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);



		int n; //numero de numeros a leer
		int suma=0;
		int x;
		int contar_numeros = 0;
		int contador_par = 0;

		System.out.println("Introduzca el numero de numeros que desea leer: ");
		n = in.nextInt();

		while (contar_numeros < n) {

			System.out.println("Introduzca un valor para el numero " + (contar_numeros +1) + " del total " + n);
			x = in.nextInt();

			if (x % 2 == 0) {
				contador_par++;
				suma += x;
			}
			contar_numeros++;

		}
		
		System.out.println("El promedio de los numeros pares es: " + (float)(suma / contador_par));



	}

}





