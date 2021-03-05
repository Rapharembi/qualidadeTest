package tdd_faturas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.time.*;
public class tdd_fatura_test {

	 Processador processador;
	 Fatura fatura;
	 Boleto bol1;
	 Boleto bol2;
	 Boleto bol3;
	 Boleto[] bols;
	
	  @BeforeEach
	  
	  public void inicializa() { 
	  processador = new Processador();
	  fatura = new Fatura (1000,"2021-03-23","Reginaldo Rossi","Em Aberto"); 
	  Boleto bol1 = new Boleto (300,"2021-02-23",456789);
	  Boleto bol2 = new Boleto (300,"2021-02-24",4556798); 
	  Boleto bol3 = new Boleto (400,"2021-02-26",456845);
	  bols = new Boleto [3];
	  bols[0] = bol1;
	  bols[1] = bol2;
	  bols[2] = bol3;
		   
	  }
	 
	 
	@DisplayName ("Testa a soma de boletos")
	@Test
	public void testSomaBoletos () {
	 Assertions.assertEquals(1000, processador.somaBoletos(bols));
	}

	@DisplayName ("Testa fatura paga")
	@Test
	public void testFaturaPaga() {
		processador.bateFatura(fatura, bols);
		Assertions.assertEquals("Paga", fatura.estadoFatura);
	}
	






}

