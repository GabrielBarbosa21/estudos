package estruturarepetitiva;

import java.util.Scanner;

public class atividade1while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Senha = sc.nextInt();
		
		while(Senha != 2002) {
			
			
			System.out.println("Senha Invalida");
			Senha = sc.nextInt();
			
			
		}
		sc.close();
//		System.out.println("Acesso permitido");
//		sc.close();
//		System.out.println("Cadastre sua senha");
//		double Senha = sc.nextDouble();
//		Double login = Senha;
//		System.out.println("Digite sua Senha");
//		Senha = sc.nextDouble();
//		while(Senha !=login) {
//			System.out.println("Senha invalida tente novamente!");
//			Senha = sc.nextDouble();
//		}
//		
//		System.out.println("Liberado");
		
		

	}

}
