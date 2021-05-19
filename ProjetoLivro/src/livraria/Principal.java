package livraria;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital livroDigital = new LivroDigital(
			"Senhor dos Anéis",
			new Autor("Tolkien", "Britânico", "tolkien@email.com"),
			"Aventura",
			5,
			10000,
			3500);

		livroDigital.info();

	}

}
