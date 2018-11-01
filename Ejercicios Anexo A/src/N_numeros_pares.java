import java.util.Scanner;

public class N_numeros_pares {

	public static void main(String[] args) {
		int n;
		int contador;
		int i;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Introduzca cuantos nº pares quiere ver ");
		n = in.nextInt();
		
		contador = 0;
		i= 2;
		while (contador < n ) {
			System.out.print(i + " ");
			contador++; //contador = contador + 1
			i = i + 2;
			
		}

	}

}
