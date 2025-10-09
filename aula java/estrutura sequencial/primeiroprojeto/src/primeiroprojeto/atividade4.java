package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int Fun;
		double Horas,Valor,Sal;
		
		System.out.print("Digite o numero do funcionario: ");
		Fun = sc.nextInt();
		System.out.print("Horas trabalhada: ");
		Horas = sc.nextDouble();
		System.out.print("Valor por Hora: ");
		Valor = sc.nextDouble();
		
		Sal = Horas * Valor;
		
		System.out.printf("Numero do Funcionario: %d%n Horas trabalhada: %.2f%n Salario: %.2f", Fun, Horas, Sal);
		
	  sc.close();

	}

}
