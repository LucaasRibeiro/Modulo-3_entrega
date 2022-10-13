package modelo;

public class ItensCompra {
	private int qtd_itens;
	private double valor_itens;

public ItensCompra() {
}

public ItensCompra(int qtd_itens, double valor_itens) {
	super();
	this.qtd_itens = qtd_itens;
	this.valor_itens = valor_itens;
}

public int getQtd_itens() {
	return qtd_itens;
}

public void setQtd_itens(int qtd_itens) {
	this.qtd_itens = qtd_itens;
}

public double getValor_itens() {
	return valor_itens;
}

public void setValor_itens(double valor_itens) {
	this.valor_itens = valor_itens;
}
	
}