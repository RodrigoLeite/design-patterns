package br.com.rodrigo.alura.observer;

public class EnviadorDeEmails implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviando por e-mail");
	}

}
