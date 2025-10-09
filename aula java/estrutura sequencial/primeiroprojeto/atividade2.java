package primeiroprojeto;
import java.util.Locale;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		double pi = 3.14159;
		double raio;
		double resultado;
		
		System.out.println("Digite o raio do circulo: ");
		
		raio = sc.nextDouble();
		raio = Math.pow(raio,2.0);
		resultado = pi * raio;
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor do raio é %.4f%n", resultado);
		
		sc.close();
	}

}
