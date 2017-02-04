package br.com.rodrigo.alura.flyweight;

import java.util.Arrays;
import java.util.List;

public class TestMusic {
	
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
				notas.get("do"),
				notas.get("re"),
				notas.get("mi"),
				notas.get("fa"),
				notas.get("fa"),
				notas.get("fa"),
				notas.get("do"),
				notas.get("re"),
				notas.get("do"),
				notas.get("re"),
				notas.get("re"),
				notas.get("re"),
				notas.get("sol"),
				notas.get("fa"),
				notas.get("mi"),
				notas.get("mi"),
				notas.get("mi"),
				notas.get("do"),
				notas.get("re"),
				notas.get("mi"),
				notas.get("fa"),
				notas.get("fa"),
				notas.get("fa")
				);
		
		Piano piano = new Piano();
		piano.toca(musica);
		
	}

}
