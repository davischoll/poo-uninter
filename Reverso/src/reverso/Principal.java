package reverso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList();
				
		String word;
		
		System.out.println("Quantas palavras você vai inserir?");
		int total = teclado.nextInt();
		
		System.out.println("Digite as palavras:");
		for(int i = 0; i < total; i++) {
			word = teclado.next();
			words.add(word);
		}
		
		System.out.println("Lista na ordem inserida:");
		System.out.println(words);
		
		System.out.println("Lista na ordem reversa:");
		for(int i = total - 1; i >= 0; i--) {
			System.out.println(words.get(i));
		}
		
		System.out.println("Lista na ordem reversa com a classe Collections:");
		Collections.reverse(words);
		System.out.println(words);

	}

}

