package lista6DeExerciciosJavaHeranca;



public class Empregado1 extends People{ // extends criando herança da classe people
	//atributos
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	//parametros construtores
	public Empregado1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto) {
		super (nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor; // uso do this para inicializar os atributos da propria classe
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	//metodos especificos da classe
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\n " + "CPF: " + getCpf() +
	"\n" + "Idade: " + getIdade()+ "\n " + "telefone: " + getTelefone() + "\n " + "Endereço: " + getEndereco() 
	 + "\nCodigo do Setor: " + codigoSetor + "\nSalario Base: " + salarioBase + "\nValor em porcentagem sem %: " + imposto);
	}
	
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salario total a ser recebido pelo empregado: " + getNome() + " é igual a: " + salarioTotal); 
	}

}
