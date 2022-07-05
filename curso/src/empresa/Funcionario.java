package empresa;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto = -1000.00;
	
	public void Aumento (double porcentagem) {
		this.salario += this.salario * (porcentagem/100);
	};
	public double getSalario() {
		return (this.salario + this.imposto);
	}
}
