package imc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Por favor, digite o seu peso:");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura:");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC atual é: %.2f", imc);

	}

}
