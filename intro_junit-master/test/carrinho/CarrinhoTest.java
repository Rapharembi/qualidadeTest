package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

class CarrinhoTest {
	
	Carrinho carrinho;
	Produto livro;
	Produto livro2;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
		livro = new Produto("Introdução ao Teste de Software", 100.00);
		livro2 = new Produto("Introdução à Qualidade de Software", 150.00);
	}
	
	@DisplayName("Testa adição ao carrinho")
	@Test
	public void testAdicao() {
		carrinho.addItem(livro);
		int add = carrinho.getQtdeItems();
		Assertions.assertEquals(1,add);
	}
	
	@DisplayName("Testa o carrinho vazio")
	@Test
	public void testEsvaziar() {
		carrinho.esvazia();
		int vaz = carrinho.getQtdeItems();
		Assertions.assertEquals(0,vaz);
	}
	
	@DisplayName("Testa valor total do carrinho")
	@Test
	public void testValorTotal() {
		carrinho.addItem(livro);
		carrinho.addItem(livro2);
		double tot = carrinho.getValorTotal();
		Assertions.assertEquals(250.00,tot);
	}
	
	@DisplayName ("Testa remoção de item")
	@Test
	public void testRemocaoItem() {
		carrinho.addItem(livro);
		try {
			carrinho.removeItem(livro2);
			fail("Exceção não lançada");
		} catch (ProdutoNaoEncontradoException e) {
			e.getMessage();
		}
	
		
		
	}
	
				
}


