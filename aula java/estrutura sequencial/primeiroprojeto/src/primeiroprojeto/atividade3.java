package primeiroprojeto;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int A,B,C,D,resultado;
		
		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Digite o Segundo numero: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto numero: ");
		D = sc.nextInt();
		
		resultado = A*B-C*D;
		
		System.out.printf("A diferença dos valores %d,%d,%d e %d%n é  %d ", A,B,C,D, resultado);
		sc.close();

	}

}
