package modelo;

import java.util.Date;

public class Compras {
	private int id_compra;
	private Date data_compra;
	private double valor_compra;

public Compras (){
}

public Compras(int id_compra, Date data_compra, double valor_compra) {
	super();
	this.id_compra = id_compra;
	this.data_compra = data_compra;
	this.valor_compra = valor_compra;
}

public int getId_compra() {
	return id_compra;
}

public void setId_compra(int id_compra) {
	this.id_compra = id_compra;
}

public Date getData_compra() {
	return data_compra;
}

public void setData_compra(Date data_compra) {
	this.data_compra = data_compra;
}

public double getValor_compra() {
	return valor_compra;
}

public void setValor_compra(double valor_compra) {
	this.valor_compra = valor_compra;
}

}