package br.com.rodrigo.alura.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	
	private final List<Item> items;
	
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
	
	public void adicionaItem(Item item) {
		this.items.add(item);
	}

	public void aplicaDescontaExtra() {
		estadoAtual.aplicaDecontoExtra(this);
	}
	
	public void aprova() {
		this.estadoAtual.aprova(this);
	}
	
	public void reprova() {
		this.estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		this.estadoAtual.finaliza(this);
	}
}
