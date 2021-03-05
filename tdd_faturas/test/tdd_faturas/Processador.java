package tdd_faturas;

import java.util.Arrays;

public class Processador {

	
	public Processador() {
		
	}
	
	public int somaBoletos(Boleto[] bols) {
		return Arrays.stream(bols).mapToInt(Boleto::getValor).sum();
	}

	public void bateFatura (Fatura fatura, Boleto[] bols) {
		
		if (fatura.valor <= somaBoletos(bols)) {
			fatura.setEstadoFatura("Paga");
		}
		else{
			fatura.setEstadoFatura("Aberta"); }
		}
	
	
}
