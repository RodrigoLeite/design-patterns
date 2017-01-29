package br.com.rodrigo.alura.observer;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("imprimindo notaFiscal");
	}

}
