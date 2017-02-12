package br.com.rodrigo.alura.flyweight;

import java.util.Arrays;
import java.util.List;

public class TestSwordArtOnline {
	
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> courage = Arrays.asList(
				notas.get("do"),notas.get("re"),notas.get("la"),notas.get("si"),notas.get("la"),notas.get("si"),notas.get("la"),notas.get("si"),notas.get("DO"),notas.get("la"),
				
				notas.get("sol"),notas.get("sol"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),notas.get("fa#"),notas.get("sol"),notas.get("re"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),notas.get("fa#"),notas.get("sol"),notas.get("fa#"),
				
				notas.get("fa#"),notas.get("sol"),notas.get("fa#"),notas.get("mi"),notas.get("fa#"),
				notas.get("mi"),notas.get("mi"),notas.get("sol"),
				notas.get("sol"),notas.get("fa#"),notas.get("mi"),notas.get("fa#"),notas.get("sol"),
				
				notas.get("sol"),notas.get("mi"),notas.get("sol"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),notas.get("fa#"),notas.get("sol"),notas.get("re"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),
				notas.get("sol"),notas.get("sol"),notas.get("sol"),notas.get("fa#"),notas.get("sol"),notas.get("fa#"),
				
				notas.get("fa#"),notas.get("sol"),notas.get("fa#"),notas.get("mi"),notas.get("fa#"),
				notas.get("mi"),notas.get("mi"),notas.get("sol"),
				notas.get("sol"),notas.get("fa#"),notas.get("mi"),notas.get("fa#"),
				
				notas.get("mi"),notas.get("sol"),notas.get("mi"),notas.get("fa#"),notas.get("sol"),notas.get("fa#"),notas.get("mi"),
				notas.get("mi"),notas.get("re"),notas.get("mi"),notas.get("sol"),notas.get("mi"),
				notas.get("mi"),notas.get("sol"),notas.get("la"),
				
				notas.get("mi"),notas.get("sol"),notas.get("mi"),notas.get("fa#"),notas.get("sol"),notas.get("fa#"),
				notas.get("mi"),notas.get("re"),notas.get("mi"),notas.get("sol"),notas.get("mi"),
				notas.get("mi"),notas.get("sol"),notas.get("re"),
				
				notas.get("re"),notas.get("mi"),notas.get("fa#"),notas.get("sol"),notas.get("fa#"),
				notas.get("re"),notas.get("re"),notas.get("re"),notas.get("si"),notas.get("si"),notas.get("la"),
				notas.get("la"),notas.get("sol"),notas.get("si"),notas.get("la"),notas.get("fa#"),notas.get("mi"),
				notas.get("DO"),notas.get("DO"),notas.get("si"),notas.get("la"),notas.get("si"),notas.get("la"),notas.get("la"),notas.get("si"),notas.get("la"),
				
				notas.get("si"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("si"),notas.get("la"),notas.get("si"),notas.get("si"),notas.get("re"),notas.get("si"),
				notas.get("la"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("si"),
				notas.get("la"),notas.get("si"),notas.get("DO"),notas.get("si"),notas.get("DO"),notas.get("si"),notas.get("la"),
				notas.get("fa#"),notas.get("sol"),notas.get("la"),notas.get("si"),notas.get("DO"),notas.get("si"),
				
				notas.get("si"),notas.get("la"),notas.get("sol"),
				notas.get("re"),notas.get("sol"),notas.get("la"),notas.get("la"),
				notas.get("fa#"),notas.get("la"),notas.get("si"),notas.get("si"),
				notas.get("fa#"),notas.get("si"),notas.get("si"),notas.get("DO"),notas.get("si"),
				notas.get("la"),notas.get("sol"),notas.get("mi"),notas.get("sol"),notas.get("sol"),
				
				notas.get("si"),notas.get("la"),notas.get("si"),notas.get("si"),notas.get("la"),
				notas.get("si"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("si"),notas.get("la"),notas.get("si"),notas.get("si"),notas.get("re"),notas.get("si"),
				notas.get("la"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("si"),
				
				notas.get("la"),notas.get("si"),notas.get("DO"),notas.get("si"),notas.get("DO"),notas.get("si"),notas.get("la"),
				notas.get("la"),notas.get("si"),notas.get("DO"),notas.get("DO"),notas.get("si"),notas.get("si"),
				
				notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("sol"),
				notas.get("re"),notas.get("sol"),notas.get("la"),notas.get("la"),
				notas.get("sol"),notas.get("la"),notas.get("si"),notas.get("si"),notas.get("la"),notas.get("si"),
				notas.get("si"),notas.get("DO"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("mi"),notas.get("sol"),notas.get("sol"),
				
				notas.get("sol"),notas.get("si"),notas.get("la"),
				notas.get("re"),notas.get("si"),notas.get("la"),notas.get("sol"),notas.get("la"),notas.get("sol")
				);
		
		Piano piano = new Piano();
		piano.toca(courage);
		
	}

}
