package br.com.rodrigo.alura.memento;

import java.util.Calendar;

public class Estado {
	
	private Contrato contrato;
	
	private Calendar data;

	public Estado(Contrato contrato) {
		super();
		this.contrato = contrato;
		this.data = Calendar.getInstance();
	}

	public Contrato getContrato() {
		return contrato;
	}

	public Calendar getData() {
		return data;
	}
}
