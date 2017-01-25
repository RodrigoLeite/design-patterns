package br.com.rodrigo.alura.template_method;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto proximo);

}
