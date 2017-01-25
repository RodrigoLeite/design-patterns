package br.com.rodrigo.alura.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	
	private final List<Item> items;

	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
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
}
