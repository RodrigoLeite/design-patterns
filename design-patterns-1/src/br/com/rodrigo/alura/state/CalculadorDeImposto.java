package br.com.rodrigo.alura.state;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}

}
