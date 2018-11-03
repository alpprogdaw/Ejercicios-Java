import java.util.Scanner;

public class Determinar_par_impar {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int z;
		
		System.out.println("Introduzca un número");
		z = in.nextInt();
		
		if (z % 2 == 0) {
			System.out.println("El numero introducido es par");
		}
		
		else {
			System.out.println("El numero introducido es impar");
			
		}
		
		in.close();
	}

}
