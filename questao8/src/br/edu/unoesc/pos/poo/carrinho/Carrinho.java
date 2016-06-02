package br.edu.unoesc.pos.poo.carrinho;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import br.edu.unoesc.pos.poo.produto.Produto;
import br.edu.unoesc.pos.poo.produto.comparator.ProdutoComparatorOrderValorDescontoCrescente;
import br.edu.unoesc.pos.poo.produto.comparator.ProdutoComparatorOrderValorDescontoDecrescente;

public class Carrinho {

	private Vector<CarrinhoItem> itens;
	
	public Carrinho() {
		itens = new Vector<CarrinhoItem>();
	}

	public boolean addItem(Produto item, int qtde){
		//TODO: Tratar duplicação de produto
		CarrinhoItem ci = new CarrinhoItem(item, qtde);
		itens.addElement(ci);
		
		return true;
	}
	
	public Integer getQtdeItensCarrinho(){
		return itens.size();
	}
	
	public Double getValorTotalCarrinho(){
		Double sum = 0.0;
		
		Iterator<CarrinhoItem> i = itens.iterator();
		while(i.hasNext()){
			sum += i.next().getValorTotal();
		}
		return sum;
	}
	
	public Double getValorComDescontoCarrinho(){
		Double sum = 0.0;
		
		Iterator<CarrinhoItem> i = itens.iterator();
		while(i.hasNext()){
			sum += i.next().getValorDesconto();
		}
		return sum;		
	}

	public void mostraConteudo() {
		Iterator<CarrinhoItem> i = itens.iterator();
		System.out.println("Descrição - Qtde - Valor Total - Valor Desconto");
		while(i.hasNext()){
			CarrinhoItem item = i.next();
			System.out.println(item.getProduto().getDescricao() + " - " + item.getQtde() + " - R$ " + item.getValorTotal() + " - R$ " + item.getValorDesconto());
		}		
		System.out.println("Total carrinho: R$ " + getValorTotalCarrinho() + " - total desconto R$ " + getValorComDescontoCarrinho());
	}
	
	public void ordenaValorDescontoCrescente() {
		Collections.sort(itens, new ProdutoComparatorOrderValorDescontoCrescente());
	}
	
	public void ordenaValorDescontoDescrescente() {
		Collections.sort(itens, new ProdutoComparatorOrderValorDescontoDecrescente());
	}
	
	public Vector<Double> getListaValorDesconto(){
		
		Vector<Double> retorno = new Vector<Double>();
		Iterator<CarrinhoItem> i = itens.iterator();
		while(i.hasNext()){
			retorno.add(i.next().getValorDesconto());
		}	
		
		return retorno;
	}

	
	//TODO: delItem e updtQtdeItem
}
