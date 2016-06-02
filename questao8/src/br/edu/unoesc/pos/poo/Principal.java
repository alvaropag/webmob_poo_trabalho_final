package br.edu.unoesc.pos.poo;

import br.edu.unoesc.pos.poo.carrinho.Carrinho;
import br.edu.unoesc.pos.poo.produto.Bebida;
import br.edu.unoesc.pos.poo.produto.Vestuario;

public class Principal {

	public static void main(String[] args){
		
		System.out.println("=================================================================================");
		System.out.println("Por favor, verifique as outras respostas na pasta respostas dentro deste projeto.");
		System.out.println("=================================================================================");
	
		Bebida cerveja = new Bebida("Cerveja Skol", 10.0);
		Vestuario camiseta = new Vestuario("Camiseta Branca", 25.0);
		Bebida redbull = new Bebida("Redbull", 15.0);
		Vestuario jeans = new Vestuario("Calça Jeans", 150.0);
		
		Carrinho carrinho = new Carrinho();
		carrinho.addItem(cerveja, 4);
		carrinho.addItem(camiseta, 2);
		carrinho.addItem(redbull, 1);
		carrinho.addItem(jeans, 1);
		
		
		System.out.println("\n\nConteúdo do carrinho:");
		carrinho.mostraConteudo();
		
		System.out.println("\nConteúdo do carrinho crescente (valor desconto):");
		carrinho.ordenaValorDescontoCrescente();;
		carrinho.mostraConteudo();
		
		System.out.println("\nConteúdo do carrinho decrescente (valor desconto):");
		carrinho.ordenaValorDescontoDescrescente();
		carrinho.mostraConteudo();
	}
}
