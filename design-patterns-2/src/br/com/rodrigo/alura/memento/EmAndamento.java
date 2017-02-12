package br.com.rodrigo.alura.memento;

public class EmAndamento implements EstadosDeUmContrato {

	@Override
	public void avanca(Contrato contrato) {
		contrato.estadoAtual = new Acertado();
	}

}
