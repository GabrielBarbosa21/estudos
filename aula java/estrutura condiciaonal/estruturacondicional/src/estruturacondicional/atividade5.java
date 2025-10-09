package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		double total,preco;
		
		if(cod == 1) {
			preco = 4.0;
			total = quant * preco;
			System.out.printf("Total: %.2f",total);
		}
		else if (cod == 2) {
		preco = 4.50;
		total = quant * preco;
		System.out.printf("Total: %.2f",total);
		}
		else if (cod == 3) {
			preco = 5.0;
			total = quant * preco;
			System.out.printf("Total: %.2f",total);
		}
		else if (cod == 4) {
			preco = 2.0;
			total = quant*preco;
			System.out.printf("Total: %.2f",total);
		}
		else if (cod == 5) {
			preco = 1.50;
			total = quant*preco;
			System.out.printf("Total: %.2f",total);
		}
		else {
			System.out.println("Codigo invalido");
		}
			
		
		
		sc.close();
	
	}

}
