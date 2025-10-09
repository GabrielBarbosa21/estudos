package estruturarepetitiva;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int Total = sc.nextInt();
		int Alc =0; 
		int Gas =0; 
		int Die =0;
		
		while(Total !=4) {
			
			if (Total == 1)
			{
				Alc = Alc+1;
				Total = sc.nextInt();
			}
			else if (Total == 2) {
				Gas = Gas+1;
				Total = sc.nextInt();
			}
			else if(Total == 3) {
				Die = Die+1;
				Total = sc.nextInt();
			}
			else if(Total>=5) {
				Total = sc.nextInt();
			}
			
		}
		System.out.println("Muito obrigada!");
		System.out.printf("Alcool: %d%n Gasolina: %d%n Diesel: %d%n",Alc,Gas,Die);
		
		sc.close();
	}

}
