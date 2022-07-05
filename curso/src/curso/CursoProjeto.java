package curso;
import calculadora.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class CursoProjeto {
	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		double Circunferencia = Calculadora.circunferencia(raio);
		double volume = Calculadora.volume(raio);
		double valorPi = Calculadora.PI;
		System.out.println(Circunferencia);
		System.out.println(volume);
		System.out.println(valorPi);
		scan.close();
	}
}
