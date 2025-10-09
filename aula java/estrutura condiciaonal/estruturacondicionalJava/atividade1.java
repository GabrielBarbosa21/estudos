package estruturacondicional;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N;
		N = sc.nextInt();
		
		if(N<0) {
			System.out.println("Negativo");
		}
		
		else {
		  System.out.println("Não negativo");
		
		}
		sc.close();
	}

}
