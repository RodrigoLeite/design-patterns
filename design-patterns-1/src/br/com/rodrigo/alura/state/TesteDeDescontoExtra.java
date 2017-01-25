package br.com.rodrigo.alura.state;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontaExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontaExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		reforma.aplicaDescontaExtra();
		
		System.out.println(reforma.getValor());
	}

}
