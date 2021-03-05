package tdd_faturas;

import java.util.Arrays;

public class Processador {

	
	public Processador() {
		
	}
	
	public int somaBoletos(Boleto[] bols) {
		return Arrays.stream(bols).mapToInt(Boleto::getValor).sum();
	}

	
	
	
}
