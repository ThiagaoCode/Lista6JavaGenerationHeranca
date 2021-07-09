package lista6DeExerciciosJavaHeranca;

public class People { //--> Superclasse ou também conhecida com classe mae
	
	//declaracao atributos     //quando declaro o atributo como private, somento os metodos da classe podem acessar
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//parametro construtor --> serve para inicializar os atributos
	public People(String nome, String endereco, String cpf, int telefone, int idade) {
		super(); // indicar que os atributos sao da super classe
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
		
	}
	
	//criacao dos metodos 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void validarCpf() {
		if(getCpf().length()!=11) // length conta a quantidade de caracteres 
			{
			
			System.out.println("\n--CPF inválido!!!");
			
		} else {
			System.out.println("\n--CPF válido!!!");
		}
	}
	

}
