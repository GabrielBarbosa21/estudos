package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Sal = sc.nextDouble();
		double pr,Total,Sobra;
		
		pr = Sal-2000;
		
		
		if(Sal <=2000.0) {
			System.out.println("Insento");
		}
		
		else if (Sal >= 2000.01 && Sal<=3000.0) {
			pr = Sal-2000;
			Total = pr*8/100;
			System.out.printf("R$ %.2f",Total);
			
		}
		else if(Sal>=3000.01 && Sal<=4500.0) {
			
			pr = Sal-2000;
			Sobra = pr-1000;	
			
			if(pr <= 1000.0) {
				Total = pr*8/100;
				System.out.printf("R$ %.2f",Total);
				
		}
			else  {
				Total = ((pr - Sobra)*8/100)+(Sobra*18/100);
				
				System.out.printf("R$ %.2f",Total);
				
			}
	}
				
		else
		{
		    pr = (1000.00 * 0.08) + (1500.00 * 0.18) + ((Sal - 4500.00) * 0.28);
		    System.out.printf("R$ %.2f",pr);
		}
		
		sc.close();

	}

}
//import java.util.Locale;
//import java.util.Scanner;
//
//public class uri1051 {
//
//	public static void main(String[] args) {
//
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double salario = sc.nextDouble();
//		
//		double imposto;
//		if (salario <= 2000.0) {
//			imposto = 0.0;
//		}
//		else if (salario <= 3000.0) {
//			imposto = (salario - 2000.0) * 0.08;
//		}
//		else if (salario <= 4500.0) {
//			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//		}
//		else {
//			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//		}
//
//		if (imposto == 0.0) {
//			System.out.println("Isento");
//		}
//		else {
//			System.out.printf("R$ %.2f%n", imposto);
//		}
//		
//		sc.close();
//	}
//}
//jeito certo de fazer
