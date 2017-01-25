package br.com.rodrigo.alura.state;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto proximo);

}
