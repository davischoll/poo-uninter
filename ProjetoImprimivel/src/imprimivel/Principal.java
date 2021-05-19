package imprimivel;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Mario", "12345678910");
		Carro carro = new Carro("Toyota", "black", 4);
		Quadrado quadrado = new Quadrado(12);
		
		Imprimivel i = funcionario;
		i.imprimir();
		i = carro;
		i.imprimir();
		i = quadrado;
		i.imprimir();
	}

}
