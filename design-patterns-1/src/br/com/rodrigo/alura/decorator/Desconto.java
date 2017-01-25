package br.com.rodrigo.alura.decorator;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto proximo);

}
