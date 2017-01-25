package br.com.rodrigo.alura.template_method;

public class IKCV extends TemplateDeImpostoCondicional {
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
	
	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItems()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

}
