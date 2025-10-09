package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
		double A,B,C,tri,cir,tra,qua,ret;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = A*C/2;
		cir = 3.14159 * Math.pow(C,2);
		tra = (A+B)*C/2;
		qua = B*B;
		ret = A*B;
		
		System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.3f%n",tri,cir,tra,qua,ret);
		
	

	}

}
