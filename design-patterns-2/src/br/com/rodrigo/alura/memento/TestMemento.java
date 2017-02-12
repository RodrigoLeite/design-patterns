package br.com.rodrigo.alura.memento;

import java.util.Calendar;

public class TestMemento {
	
	public static void main(String[] args) {
		
		Historico historico = new Historico();
		
		Contrato contrato = new Contrato(Calendar.getInstance(), "Rodrigo", new Novo());
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato);
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato);
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato);
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato);
		
		contrato.restaura(historico.pega(0));
		System.out.println(contrato);
	}

}
