package br.com.rodrigo.alura.interpreter;

public class TestInterpreter {
	
	public static void main(String[] args) {
		
		Expressao conta = new Soma(new Numero(10), new Numero(20));
		System.out.println(conta.avalia());
		
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		System.out.println(resultado);
		
	}

}
