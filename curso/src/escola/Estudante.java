package escola;

public class Estudante {
	public String nome;
	public double[] nota;
	public String situacao;
	
	public double notaFinal() {
		int i = 0;
		double resultado = 0;
		while (i < 2 ) {
			double antigo = nota[i];
			i++;
			resultado += antigo + nota[i];
		};
		return resultado;
	};
	
}
