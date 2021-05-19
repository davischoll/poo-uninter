package imprimivel;

public class Quadrado implements Imprimivel {
	int medidaLado;

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("Quadrado:");
		System.out.println("Medida dos lados: " + medidaLado);
		System.out.println("Área do Quadrado: " + (2 * medidaLado));
		System.out.println("------");
	}
}
