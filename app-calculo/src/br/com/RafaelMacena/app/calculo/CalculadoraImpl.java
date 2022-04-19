package br.com.RafaelMacena.app.calculo;

import br.com.RafaelMacena.app.Calculadora;
import br.com.RafaelMacena.app.calculo.interno.OperacoesAritimeticas;
import br.com.RafaelMacena.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}
	
	

}
