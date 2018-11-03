import java.util.Scanner;

public class Generar_pares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int contador = 0;
		int n;
		int i = 2;
		
		System.out.println("Introduce el numero de pares que quiere generar: ");
		n = in.nextInt();
		
		while (contador < n) {
			System.out.print(i + ", ");
			contador++;
			i = i + 2;
		}
		
		in.close();

	}

}
