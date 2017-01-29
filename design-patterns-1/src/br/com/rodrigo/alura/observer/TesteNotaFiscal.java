package br.com.rodrigo.alura.observer;

import java.util.ArrayList;
import java.util.List;

public class TesteNotaFiscal {

	public static void main(String[] args) {

		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(new EnviadorDeEmails());
		acoes.add(new NotaFiscalDao());
		acoes.add(new EnviadorDeSms());
		acoes.add(new Impressora());

		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);
		NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.comItem(new ItemDaNota("Item 1", 100.0))
				.comItem(new ItemDaNota("Item 2", 300.0))
				.comItem(new ItemDaNota("Item 3", 300.0))
				.comObservacoes("observacoes").naDataAtual()
				.adicionaAcaoAposGerarNota(new EnviadorDeEmails())
				.adicionaAcaoAposGerarNota(new NotaFiscalDao())
				.adicionaAcaoAposGerarNota(new EnviadorDeSms())
				.adicionaAcaoAposGerarNota(new Impressora())
				.adicionaAcaoAposGerarNota(new Multiplicador(2))
				.adicionaAcaoAposGerarNota(new Multiplicador(3))
				.adicionaAcaoAposGerarNota(new Multiplicador(5.5)).constroi();

		System.out.println("Valor Total Bruto: " + notaFiscal.getValorBruto());
		System.out.println("Valor dos impostos: " + notaFiscal.getImpostos());
	}

}
