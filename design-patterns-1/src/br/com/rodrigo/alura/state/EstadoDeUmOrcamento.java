package br.com.rodrigo.alura.state;

public interface EstadoDeUmOrcamento {
	
	public void aplicaDecontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);

}
