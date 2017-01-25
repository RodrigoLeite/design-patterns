package br.com.rodrigo.alura.chain_of_resposibility;

public class DescontoPorCincoItens implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItems().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
