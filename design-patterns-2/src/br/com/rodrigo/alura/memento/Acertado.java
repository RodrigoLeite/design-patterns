package br.com.rodrigo.alura.memento;

public class Acertado implements EstadosDeUmContrato {

	@Override
	public void avanca(Contrato contrato) {
		contrato.estadoAtual = new Concluido();
	}

}
