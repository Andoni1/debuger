
public class Factorial {
	
	
	public static void factorial(int number) {
		int resultado=1;
		
		for(int i=1; i<=number;i++) {
			resultado=resultado*i;
		}
		System.out.println(resultado);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero:");
		int numero=Console.readInt();
		
		factorial(numero);
		
		
	}

}
