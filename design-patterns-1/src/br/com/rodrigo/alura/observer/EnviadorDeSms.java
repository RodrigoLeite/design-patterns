package br.com.rodrigo.alura.observer;

public class EnviadorDeSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviando por sms");	
	}

}
