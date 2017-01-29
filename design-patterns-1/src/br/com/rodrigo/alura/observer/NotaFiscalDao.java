package br.com.rodrigo.alura.observer;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salvando no banco");
	}

}
