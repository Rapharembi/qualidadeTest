package tdd_faturas;


public class Boleto {
	public int valor;
	public String data;
	public long codigo;
	
	public Boleto(int valor, String data, long codigo) {
		this.valor = valor;
		this.data = data;
		this.codigo = codigo;
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
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo (long codigo) {
		this.codigo = codigo;
	}
	
}
