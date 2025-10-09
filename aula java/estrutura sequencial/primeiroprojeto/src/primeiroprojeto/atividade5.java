package primeiroprojeto;
import java.util.Locale;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner  sc = new  Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod1,num1,cod2,num2;
		double val1,val2,res;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		res = num1*val1 + num2*val2;
		
		System.out.printf("Valor a pagar R$: %.2f",res);
		
		
		

	}

}
