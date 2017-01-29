package br.com.rodrigo.alura.builder;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		NotaFiscal notaFiscal = builder
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.comItem(new ItemDaNota("Item 1", 100.0))
				.comItem(new ItemDaNota("Item 2", 300.0))
				.comItem(new ItemDaNota("Item 3", 300.0))
				.comObservacoes("observacoes")
				.naDataAtual()
				.constroi();

		
		System.out.println("Valor Total Bruto: " + notaFiscal.getValorBruto());
		System.out.println("Valor dos impostos: " + notaFiscal.getImpostos());
	}

}
