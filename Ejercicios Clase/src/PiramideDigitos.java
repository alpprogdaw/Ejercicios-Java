
public class PiramideDigitos {

	public static void main(String[] args) {
		int i,j;
		for (i = 1; i <= 10; i++) {
			
			int n = i % 10;
			int digitos = i + i - 1;
			int espacios = 10 - i;
			

			for (j = 0; j < espacios; j++)
				System.out.print(" ");

			for (int h = 0; h < digitos; h++) {
				
				if (h >= digitos / 2) {
					System.out.print(n--%10);
				} else 
					if (h <= digitos / 2) {
					System.out.print(n++%10);
				}
			}
			System.out.println();
		}
	}

}
