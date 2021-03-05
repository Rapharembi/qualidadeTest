package tdd_faturas;

public class Pagamento {

	public int valor;
	public String data;
	public String tipoPagamento;
	
	public Pagamento (int valor, String data, String tipoPagamento) {
		this.valor = valor;
		this.data = data;
		this.tipoPagamento = tipoPagamento;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor (int valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData (String data) {
		this.data = data;
	}
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento (String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}



}
