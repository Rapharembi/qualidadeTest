package tdd_faturas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class tdd_fatura_test {

	/*
	 * @BeforeEach public void inicializa() { Fatura fatura = new Fatura (); Boleto
	 * [] bols={bol1,bol2,bol3};  Boleto bol1 = new Boleto (); Boleto bol2 = new
	 * Boleto (); Boleto bol3 = new Boleto (); bols[0] = bol1; bols[1] = bol2;
	 * bols[2] = bol3; }
	 */
	
	@Test
	public void testFaturaPaga () {
		Fatura fatura = new Fatura ();
		Assertions.assertEquals(1000, fatura.somaBoletos());
	}
}
