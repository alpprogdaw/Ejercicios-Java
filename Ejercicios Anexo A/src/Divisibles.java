import java.util.Scanner;

public class Divisibles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int x;
		int y;
		
		System.out.println("Introduce dos numeros: ");
		x = in.nextInt();
		y = in.nextInt();
		
		if ((x % y == 0) || (x % y == 0)){
			System.out.println("Los numeros son divisibles");
		}
		else {
			System.out.println("Los numeros no son divisibles");
		}
		in.close();
	}

}
