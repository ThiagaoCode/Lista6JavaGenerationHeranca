package lista6DeExerciciosJavaHeranca;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando um objeto do tipo Empregado1 e passando os valores dos paramentros
		Empregado1 hebert = new Empregado1("Hebert", "Rua pirajussara, 33", "12345678910", 99998899, 23, 1234, 15000,10);
		
		hebert.imprimirInfo(); // invocando o metodo da classe Empregado1
		hebert.calcularSalario();
		
		
		

	}

}
