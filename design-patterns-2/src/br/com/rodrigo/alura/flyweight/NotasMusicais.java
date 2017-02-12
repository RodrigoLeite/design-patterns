package br.com.rodrigo.alura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String, Nota> notas = new HashMap<>();
	
	static {
		notas.put("DO", new DoMaior());
		notas.put("RE", new ReMaior());
		notas.put("MI", new MiMaior());
		notas.put("FA", new FaMaior());
		notas.put("SOL", new SolMaior());
		notas.put("LA", new LaMaior());
		notas.put("SI", new SiMaior());
		notas.put("do", new DoMenor());
		notas.put("re", new ReMenor());
		notas.put("mi", new MiMenor());
		notas.put("fa", new FaMenor());
		notas.put("sol", new SolMenor());
		notas.put("la", new LaMenor());
		notas.put("si", new SiMenor());
		notas.put("fa#", new FaSustenido());
	}
	
	public Nota get(String nome) {
		Nota nota = notas.get(nome);
		if (nota != null) {
			return nota;
		}
		throw new IllegalArgumentException("A nota " + nome + " não está mapeada.");
	}

}
