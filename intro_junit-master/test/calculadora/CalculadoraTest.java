package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	@DisplayName("Testa divis�o de dois n�meros")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@DisplayName ("Testa divis�o por zero")
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@DisplayName("Testa subtra��o de dois n�meros")
	@Test
	public void testSubtracaoDoisNumeros() {
		int sub = calc.subtracao(5, 3);
		Assertions.assertEquals(2, sub);
	}
	
	@DisplayName("Testa multiplica��o de dois n�meros")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int mult = calc.multiplicacao(2, 4);
		Assertions.assertEquals(8, mult);
	}
	
	@DisplayName("Testa somat�rio")
	@Test
	public void testSomatorio() {
		int somat = calc.somatoria(4);
		Assertions.assertEquals(10, somat);
	}
	
	@DisplayName("Testa positivos")
	@Test
	public void testPositivos() {
		boolean pos = calc.ehPositivo(0);
		Assertions.assertTrue(pos, "N�mero n�o � positivo");
	}
	
	@DisplayName("Testa iguais")
	@Test
	public void testIguais() {
		int igs = calc.compara(2, 2);
		Assertions.assertEquals(0,igs);
	}
	
	@DisplayName("Testa maior")
	@Test
	public void testMaior() {
		int maior = calc.compara(2, 3);
		Assertions.assertEquals(-1,maior);
	}
	
	@DisplayName("Testa menor")
	@Test
	public void testMenor() {
		int menor = calc.compara(3, 2);
		Assertions.assertEquals(1,menor);
	}
}
