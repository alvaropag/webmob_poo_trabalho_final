package br.edu.unoesc.pos.poo.produto.test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.unoesc.pos.poo.produto.Bebida;
import br.edu.unoesc.pos.poo.produto.Vestuario;

public class ProdutoTest {

	@Test
	public void deveDescontar5PorCentoBebida() {
		Bebida b = new Bebida("Bebida teste", 100.0);
		assertThat(b.getValorDesconto(), is(95.00));
	}
	
	@Test
	public void deveDescontar25PorCentoVestuario() {
		Vestuario v = new Vestuario("Vestuário teste", 100.0);
		assertThat(v.getValorDesconto(), is(75.00));
	}

}
