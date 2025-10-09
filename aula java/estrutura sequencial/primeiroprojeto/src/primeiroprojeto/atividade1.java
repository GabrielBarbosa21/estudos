package primeiroprojeto;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int resultado;
		int x;
		int y;
		
		
		System.out.println("Digite o primeiro numero: ");
		x=sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		y=sc.nextInt();
		
		resultado = x + y;
		
		System.out.println("O valor da soma de "+x+ " e "+y+" é igual a "+resultado+" ");
		
		sc.close();

	}

}
