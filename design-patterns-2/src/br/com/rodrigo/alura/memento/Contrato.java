package br.com.rodrigo.alura.memento;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	
	private String cliente;
	
	protected EstadosDeUmContrato estadoAtual;

	public Contrato(Calendar data, String cliente, EstadosDeUmContrato estadoAtual) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.estadoAtual = estadoAtual;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public EstadosDeUmContrato getEstadoAtual() {
		return estadoAtual;
	}

	public void avanca() {
		this.estadoAtual.avanca(this);
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(data, cliente, estadoAtual));
	}
	
	public void restaura(Estado estado) {
		this.data = estado.getContrato().getData();
		this.cliente = estado.getContrato().getCliente();
		this.estadoAtual = estado.getContrato().getEstadoAtual();
	}

	@Override
	public String toString() {
		return "Contrato [cliente=" + cliente + ", estadoAtual=" + estadoAtual + "]";
	}
}
