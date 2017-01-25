package br.com.rodrigo.alura.chain_of_resposibility;

public class ISS implements Imposto {
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
