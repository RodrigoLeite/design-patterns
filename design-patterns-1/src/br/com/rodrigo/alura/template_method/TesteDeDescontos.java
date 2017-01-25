package br.com.rodrigo.alura.template_method;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDesconto desconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double descontoFinal = desconto.calcular(orcamento);
		System.out.println(descontoFinal);
	}

}
