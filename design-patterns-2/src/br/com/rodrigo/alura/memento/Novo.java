package br.com.rodrigo.alura.memento;

public class Novo implements EstadosDeUmContrato {

	@Override
	public void avanca(Contrato contrato) {
		contrato.estadoAtual = new EmAndamento();
	}

}
