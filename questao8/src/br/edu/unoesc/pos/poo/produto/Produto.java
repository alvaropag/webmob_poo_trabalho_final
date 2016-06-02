package br.edu.unoesc.pos.poo.produto;

public abstract class Produto {
	private Double valor = 0.0;
	
	/**
	 * Valor de 0.0 a 1.0, sendo 0.0 = 0% e 1.0 = 100%
	 * */
	private Double desconto = 0.0;
	private String descricao = "";
	
	protected Produto(String descricao, Double valor, Double desconto){
		this.descricao = descricao;
		this.valor = valor;
		this.desconto = desconto;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Double getValorDesconto(){
		return valor - (valor * desconto);
	}
	
	@Override
	public String toString(){
		return descricao;
	}
	
	protected void setValor(Double valor) {
		this.valor = valor;
	}
		
	protected void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	
	
}
