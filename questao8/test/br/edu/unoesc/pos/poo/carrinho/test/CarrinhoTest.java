package br.edu.unoesc.pos.poo.carrinho.test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import br.edu.unoesc.pos.poo.carrinho.Carrinho;
import br.edu.unoesc.pos.poo.produto.Bebida;
import br.edu.unoesc.pos.poo.produto.Vestuario;


public class CarrinhoTest {
	
	private Carrinho carrinho;
	
	@Before
	public void before(){
		carrinho = new Carrinho();
		carrinho.addItem(new Bebida("Bebida Teste", 10.0), 2);
		carrinho.addItem(new Bebida("Bebida Teste 2", 15.0), 3);
		carrinho.addItem(new Vestuario("Vestuario Teste ", 30.0), 1);
		carrinho.addItem(new Vestuario("Vestuario Teste 2", 5.0), 5);
	}

	@Test
	public void verificaOrdenacaoDecrescente() {
		carrinho.ordenaValorDescontoDescrescente();
		Vector<Double> ordenado = carrinho.getListaValorDesconto();
		
		Vector<Double> lista_manual = new Vector<Double>();
		lista_manual.add(42.75);
		lista_manual.add(22.5);
		lista_manual.add(19.0);		
		lista_manual.add(18.75);
		assertThat(ordenado, is(lista_manual));
	}

	@Test
	public void verificaOrdenacaoCrescente() {
		carrinho.ordenaValorDescontoCrescente();
		Vector<Double> ordenado = carrinho.getListaValorDesconto();
		
		Vector<Double> lista_manual = new Vector<Double>();
		
		lista_manual.add(18.75);
		lista_manual.add(19.0);
		lista_manual.add(22.5);
		lista_manual.add(42.75);
		
		assertThat(ordenado, is(lista_manual));
	}
	
	@Test
	public void verificaValorTotal() {
		Double valor_calculado = carrinho.getValorTotalCarrinho();
		
		assertThat(valor_calculado, is(120.0));
	}
	
	@Test
	public void verificaValorComDesconto() {
		Double valor_calculado = carrinho.getValorComDescontoCarrinho();
		
		assertThat(valor_calculado, is(103.0));
	}	

}
