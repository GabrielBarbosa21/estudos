package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int par = sc.nextInt();
		
		
		
		if(par%2 ==0) {
			System.out.println("PAR");
					
		}else {
			
			System.out.println("IMPAR");
		}
		sc.close();
		

	}

}
