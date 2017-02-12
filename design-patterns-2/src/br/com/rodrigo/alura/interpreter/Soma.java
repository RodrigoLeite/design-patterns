package br.com.rodrigo.alura.interpreter;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsqueda = this.esquerda.avalia();
		int valorDaDireita = this.direita.avalia();
		
		return valorDaEsqueda + valorDaDireita;
	}

}
