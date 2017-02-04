package br.com.rodrigo.alura.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	
	public void toca(List<Nota> notas) {
		Player player = new Player();
		
		StringBuilder builder = new StringBuilder();
		for (Nota nota : notas) {
			builder.append(nota.simbolo() + " ");
		}
		System.out.println(builder.toString());
		
		player.play(builder.toString());
	}

}
