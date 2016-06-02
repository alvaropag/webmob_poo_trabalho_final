package br.edu.unoesc.pos.poo.produto.comparator;

import java.util.Comparator;

import br.edu.unoesc.pos.poo.carrinho.CarrinhoItem;

public class ProdutoComparatorOrderValorDescontoDecrescente implements Comparator<CarrinhoItem> {


	@Override
	public int compare(CarrinhoItem o1, CarrinhoItem o2) {
		if (o1.getValorDesconto() > o2.getValorDesconto()){
			return -1;
		}
		else if (o1.getValorDesconto() == o2.getValorDesconto()){
			return 0;
		}
		else 
			return 1;
	}

}
