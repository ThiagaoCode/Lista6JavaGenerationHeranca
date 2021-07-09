package lista6DeExerciciosJavaHeranca;

public class Fornecedor extends People{
	
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, 
			double valorCredito, double valorDivida) {
		super (nome, endereco, cpf, telefone, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	// metodos especificos
	
	public void imprimirInfo() {
		System.out.println("\nNome do fornecedor: " + getNome() + "\n " + "CPF: " + getCpf() +
	"\n" + "Idade: " + getIdade()+ "\n " + "telefone: " + getTelefone() + "\n " + "Endereço: " + getEndereco() 
	 + "\nValor de credito do fornecedor " +getNome() + ": " + valorCredito +
	 "\nvalor da divida foi: " + valorDivida);
	}
	
	public void validarCpf() {
		if(getCpf().length()!=11) // length conta a quantidade de caracteres 
			{
			
			System.out.println("\n--CPF inválido!!!");
			
		} else {
			System.out.println("\n--CPF válido!!!");
		}
	}
	
	public void obterSaldo() {
		double diferencaCredito = valorCredito - valorDivida;
		System.out.println("\nO saldo referente ao fornecedo é igual a: " + diferencaCredito);
	}
}
