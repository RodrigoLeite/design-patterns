package br.com.rodrigo.alura.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	List<Estado> estadosSalvos;
	
	public Historico() {
		this.estadosSalvos = new ArrayList<>();
	}
	
	public void adiciona(Estado estado) {
		this.estadosSalvos.add(estado);
	}
	
	public Estado pega(int index) {
		return this.estadosSalvos.get(index);
	}

}
