package br.com.rodrigo.alura.chain_of_resposibility;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto proximo);

}
