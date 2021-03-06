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
	 Boleto bol4;
	 Boleto[] bols;
	 Boleto [] bols2;
	 Boleto[] bols3;
	 Pagamento[] pags;
	 Pagamento[] pags2;
	 Pagamento[] pags3;
	 Pagamento[] pags4;
	
	  @BeforeEach
	  
	  public void inicializa() { 
	  processador = new Processador();
	  fatura = new Fatura (1000,"2021-03-23","Reginaldo Rossi","Aberta"); 
	  Boleto bol1 = new Boleto (300,"2021-02-23",456789);
	  Boleto bol2 = new Boleto (300,"2021-02-24",4556798); 
	  Boleto bol3 = new Boleto (400,"2021-02-26",456845);
	  Boleto bol4 = new Boleto (2000,"2021-03-05",89546);
	  bols = new Boleto [3];
	  bols2 = new Boleto [2];
	  bols3 = new Boleto[2];
	  bols[0] = bol1;
	  bols[1] = bol2;
	  bols[2] = bol3;
	  bols2[0] = bol1;
	  bols2 [1] = bol2;
	  bols3[0] = bol3;
	  bols3[1] = bol4;
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
	
	@DisplayName ("Testa fatura em aberto")
	@Test
	public void testFaturaAberta() {
		processador.bateFatura(fatura, bols2);
		Assertions.assertEquals("Aberta", fatura.estadoFatura);
	}
	
	@DisplayName ("Testa criação de pagamentos")
	@Test
	public void testPagamento () {
		pags = processador.criaPagamentos(bols, pags);
		Assertions.assertEquals(3, pags.length);
	}
	
	@DisplayName ("Testa Processamento")
	@Test
	public void testProcessamento() {
		pags2 = processador.processaFatura(fatura, bols, pags2); //3 boletos somando 1000 reais, fatura de 1000 reais
		Assertions.assertEquals("Paga", fatura.estadoFatura);
		Assertions.assertEquals(3, pags2.length);
		
		pags3 = processador.processaFatura(fatura, bols2, pags3); //2 boletos somando 600 reais, fatura de 1000 reais
		Assertions.assertEquals("Aberta", fatura.estadoFatura);
		Assertions.assertEquals(2,pags3.length);
		
		pags4 = processador.processaFatura(fatura, bols3, pags4); //2 boletos somando 2400 reais, fatura de 1000 reais
		Assertions.assertEquals("Paga", fatura.estadoFatura);
		Assertions.assertEquals(2,pags4.length);
	}





}

