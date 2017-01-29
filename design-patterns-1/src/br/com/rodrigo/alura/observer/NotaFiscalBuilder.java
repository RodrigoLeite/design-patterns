package br.com.rodrigo.alura.observer;

import java.util.ArrayList; 
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	private String observacoes;
	
	private List<AcaoAposGerarNota> acoesAposGerarNota;
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoesAposGerarNota) {
		this.itens = new ArrayList<>();
		this.acoesAposGerarNota = acoesAposGerarNota;
		this.dataDeEmissao = Calendar.getInstance();
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota itemDaNota) {
		this.itens.add(itemDaNota);
		this.valorBruto += itemDaNota.getValor();
		this.impostos += itemDaNota.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.dataDeEmissao = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar novaData) {
		this.dataDeEmissao = novaData;
		return this;
	}
	
	public NotaFiscalBuilder adicionaAcaoAposGerarNota(AcaoAposGerarNota acao) {
		this.acoesAposGerarNota.add(acao);
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
		
		for (AcaoAposGerarNota acao : acoesAposGerarNota) {
			acao.executa(nf);
		}
		
		return nf;
	}

}
