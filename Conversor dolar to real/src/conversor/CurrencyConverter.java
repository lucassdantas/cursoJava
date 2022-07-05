package conversor;

public class CurrencyConverter {

	public static final double IOF = 6;
	public static double toReal(double dolarC ,double dolarV) {
		return dolarC * (dolarV + dolarV *(IOF/100));
	}
}
