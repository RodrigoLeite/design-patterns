package br.com.rodrigo.alura.interpreter;

public class Divisao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsqueda = this.esquerda.avalia();
		int valorDaDireita = this.direita.avalia();
		
		if (valorDaDireita == 0) {
			throw new RuntimeException("Não pode dividir por 0.");
		}
		return valorDaEsqueda / valorDaDireita;
	}

}
