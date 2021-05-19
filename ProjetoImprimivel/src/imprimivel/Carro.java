package imprimivel;

public class Carro implements Imprimivel{
	String marca;
	String cor;
	int qtPortas;

	public Carro(String marca, String cor, int qtPortas) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.qtPortas = qtPortas;
	}

	@Override
	public void imprimir() {
		System.out.println("Carro:");
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Portas: " + qtPortas);
		System.out.println("------");
	}

}
