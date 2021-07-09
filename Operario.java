package lista6DeExerciciosJavaHeranca;

public class Operario extends People{
	//atributos
	private double valorProducao;
	private double comissao;
	
	//parametro construtor
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao) {
		super (nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
		//metodos
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//metodos especifico
	public void imprimirInfo() {
		System.out.println("\nNome do operario: " + getNome() + "\n " + "CPF: " + getCpf() +
	"\n" + "Idade: " + getIdade()+ "\n " + "telefone: " + getTelefone() + "\n " + "Endereço: " + getEndereco() 
	 + "\nValor monetario total dos a total dos artigos produzidos por " +getNome() + ": " + valorProducao +
	 "\nPorcentagem sem % da comissao deste artigo: " + comissao);
	}
	
	public void calcularSalario() {
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operario: " + getNome() + " é igual a: " + valorTotal); 
	}
	
	/*public void validarCpf() {
		
	} // nao utilizado */

}
