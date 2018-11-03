import java.util.Scanner;

public class Factorial_de_un_numero {

	public static void main(String[] args) {
		//Factorial de n
		Scanner in = new Scanner (System.in);
		
		int producto = 1;
		int n;
		
		System.out.println("Introduca un nº para el cual quiere calcular su factorial");
		n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			producto = producto * i;
		}
		System.out.println(n+ "! = " + producto);
	}

}
