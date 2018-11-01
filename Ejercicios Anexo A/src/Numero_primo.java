
public class Numero_primo {

	public static void main(String[] args) {
		int n = 5; 
		int i = 2;
		
		while ((i < n) && (n % i != 0)) {
			i++;
		}
		if (i==n) {
			System.out.println("El numero " + n + " es primo");
		}
		else {
			System.out.println("El numero " + n + " no es primo");
		}
	}

}
