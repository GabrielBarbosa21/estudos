package primeiroprojeto;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product:");
		System.out.printf("Computer, with price is $ %.0f%n ", prince1 );
		//System.out.println(prince1);
		
		System.out.print("Record: ");
		System.out.printf("%d years old, code %d and gender: %s %n", age, code, gender );
		
		System.out.printf("Measue with eigth decimal places: %f %n",measure);
		System.out.printf("Rouseded (Three decimal places): %.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f",measure);

	}

}
