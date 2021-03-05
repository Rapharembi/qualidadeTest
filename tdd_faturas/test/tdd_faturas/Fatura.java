package tdd_faturas;
import java.util.Arrays;

public class Fatura {

	
	public int valor;
	public String data;
	public String nomeCliente;
	public String estadoFatura;
	
	
	public Fatura (int valor, String data, String nomeCliente, String estadoFatura) {
		this.valor = valor;
		this.data = data;
		this.nomeCliente = nomeCliente;
		this.estadoFatura = estadoFatura;
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
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setCodigo (String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getEstadoFatura() {
		return estadoFatura;
	}

	public void setEstadoFatura (String estadoFatura) {
		this.estadoFatura = estadoFatura;
	}
	
	
}
