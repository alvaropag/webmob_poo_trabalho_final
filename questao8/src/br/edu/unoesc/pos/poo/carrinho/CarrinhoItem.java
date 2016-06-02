package br.edu.unoesc.pos.poo.carrinho;

import br.edu.unoesc.pos.poo.produto.Produto;

public class CarrinhoItem{
	private Produto item;
	private Integer qtde;
	
	public CarrinhoItem(Produto item, Integer qtde) {
		this.item = item;
		this.qtde = qtde;
	}
	
	public void updateQtde(Integer qtde){
		this.qtde = qtde;
	}
	
	public Produto getProduto(){
		return item;
	}
	
	public Integer getQtde(){
		return qtde;
	}

	public Double getValorTotal(){
		return qtde * item.getValor();
	}
	
	public Double getValorDesconto(){
		return qtde * item.getValorDesconto();
	}
	

}
