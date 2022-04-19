package br.com.RafaelMacena.app.financeiro;

import java.util.ServiceLoader;

import br.com.RafaelMacena.app.Calculadora;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));

		// OperacoesAritimeticas op = new OperacoesAritimeticas();
		// System.out.println(op.soma(1, 5, 9));
	}

}
