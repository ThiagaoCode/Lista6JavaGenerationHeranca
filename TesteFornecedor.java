package lista6DeExerciciosJavaHeranca;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new --> vai instanciar um novo objeto
		Fornecedor thiagopedroso = new Fornecedor ("Thiago Pedros" , "Rua dos romeus, 420", "33322483711", 998282828, 26, 20000, 10000);
		Fornecedor leticiamaria = new Fornecedor ("Leticia Maria", " rua das magnolias, 11 ", "24358362588", 998271717, 26, 30000, 5000);
		
		
		thiagopedroso.imprimirInfo();
		System.out.println("\n");
		thiagopedroso.validarCpf();
		System.out.println("\n");
		thiagopedroso.obterSaldo();
		
		System.out.println("\n\t********** Próximo Fornecedor *********");
		
		leticiamaria.imprimirInfo();
		System.out.println("\n");
		leticiamaria.validarCpf();
		System.out.println("\n");
		leticiamaria.obterSaldo();

	}

}
