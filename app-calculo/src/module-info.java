
module app.calculo {
	requires  app.logging;
	exports br.com.RafaelMacena.app.calculo;
	
	exports br.com.RafaelMacena.app.calculo.interno
	to app.financeiro;
	
	requires app.api;
	provides br.com.RafaelMacena.app.Calculadora
	  with br.com.RafaelMacena.app.calculo.CalculadoraImpl;
}