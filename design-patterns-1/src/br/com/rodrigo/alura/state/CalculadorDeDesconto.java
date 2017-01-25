package br.com.rodrigo.alura.state;

public class CalculadorDeDesconto {

	public double calcular(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconta(orcamento);
	}
}
