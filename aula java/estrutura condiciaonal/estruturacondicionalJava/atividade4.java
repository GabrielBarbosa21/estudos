package estruturacondicional;


import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Inicial = sc.nextInt();
		int Final = sc.nextInt();
		int dur;
		
		
		if(Final > Inicial) {
			
			dur = Final - Inicial;
			System.out.println("O jogo durou "+dur+" Hora(s) ");
			
			
		}else{
			if(Inicial == Final) {
				
				dur = 24;
				System.out.println("O jogo durou "+dur+" Hora(s) ");
				
			}else {
				dur = (24 - Inicial) + Final;
				System.out.println("O jogo durou "+dur+" Hora(s) ");
				
				
			}
			
			
		}
		sc.close();
	}

}
