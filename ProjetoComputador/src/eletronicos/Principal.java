package eletronicos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Desktop compA = new Desktop(8, 4, 600);

		Notebook compB = new Notebook(8, 4, 13);

		Computador comp;

		comp = compA;
		System.out.println("Valor: " + comp.calculaValor());

		System.out.println("=============");

		comp = compB;
		System.out.println("Valor: " + comp.calculaValor());

		System.out.println();
		System.out.println("=============");

		// CRIANDO UMA LISTA DE COMPUTADORES E CALCULANDO O VALOR TOTAL DOS PRODUTOS:

		ArrayList<Computador> listaComputadores = new ArrayList();

		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new Desktop(16, 8, 1200));
		listaComputadores.add(new Notebook(16, 8, 15));

		float valorTotal = 0;

		for (Computador computador : listaComputadores) {
			valorTotal += computador.calculaValor();
		}

		System.out.println("Valor total dos computadores: " + valorTotal);
	}

}
