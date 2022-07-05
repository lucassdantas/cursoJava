package curso;
import conversor.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CursoProjeto {
	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o valor atual do dolar?");
		double dolarCotation = scan.nextDouble();
		System.out.println("Quantos dolares pretende comprar?");
		double dolarValue = scan.nextDouble();
		double realValue = CurrencyConverter.toReal(dolarCotation, dolarValue);
		System.out.printf("Você pagara R$ %.2f pelos dolares", realValue);
		scan.close();
	}
}
