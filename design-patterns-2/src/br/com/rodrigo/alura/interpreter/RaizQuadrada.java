package br.com.rodrigo.alura.interpreter;

public class RaizQuadrada implements Expressao {
	
	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		int valorDaExpressao = expressao.avalia();
		Double raizQuadrada = Math.sqrt(valorDaExpressao);
		return raizQuadrada.intValue();
	}

}
