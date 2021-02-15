package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;

class CarrinhoTest {
	
	Carrinho carrinho;
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}
	
	@DisplayName("Testa adição ao carrinho")
	@Test
	public void testAdicao() {
		
	}
	

}
