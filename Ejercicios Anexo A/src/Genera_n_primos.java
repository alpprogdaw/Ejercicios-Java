import java.util.Scanner;
/**
 * Ejercicio 5 de Anexo A problemas
 * 
 * Generar los primeros n números primos
 * 
 * @author alode
 * @version 1.0
 */
public class Genera_n_primos {

	public static void main(String[] args) {
		int n;
		int i;
		int m;
		int contador;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Introduzca cuantos numeros primos quiere mostrar ");
		n = in.nextInt();
		
		if (n == 1)
			System.out.println("1");
		
		else if (n==2)
			System.out.println("1,2");
		
		else if (n==3)
			System.out.println("1,2,3");
		
		else {
			System.out.print("1,2,3");
			contador = 3;
			m = 4; //el siguiente numero de los numeros a investigar si es primo
			while (contador < n) {
				i = 2;
				while (i < m && m % i !=0) {
					i++;
				}
				if (i == m) {
					contador++; 
					System.out.print("-" + m);
					m++;
				}
				else {
					m++;
				}
				
			}
		}
		
		

	}

}
