package br.com.rodrigo.alura.memento;

public class Concluido implements EstadosDeUmContrato {

	@Override
	public void avanca(Contrato contrato) {
		throw new RuntimeException("Contrato já concluído!");
	}

}
