package modelo;

import javax.xml.crypto.Data;

public class Comprar {

	private int id_compra;

	private String tipo_compra;

	private double valor_compra;

	private double descontos_compra;

	private Data data_compra;

	public Comprar() {

	}

	public Comprar(int id_compra, String tipo_compra, double valor_compra, double descontos_compra, Data data_compra) {
		super();
		this.id_compra = id_compra;
		this.tipo_compra = tipo_compra;
		this.valor_compra = valor_compra;
		this.descontos_compra = descontos_compra;
		this.data_compra = data_compra;
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public String getTipo_compra() {
		return tipo_compra;
	}

	public void setTipo_compra(String tipo_compra) {
		this.tipo_compra = tipo_compra;
	}

	public double getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}

	public double getDescontos_compra() {
		return descontos_compra;
	}

	public void setDescontos_compra(double descontos_compra) {
		this.descontos_compra = descontos_compra;
	}

	public Data getData_compra() {
		return data_compra;
	}

	public void setData_compra(Data data_compra) {
		this.data_compra = data_compra;
	}

}
