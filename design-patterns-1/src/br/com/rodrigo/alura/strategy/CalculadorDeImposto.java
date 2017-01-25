package br.com.rodrigo.alura.strategy;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}

}
