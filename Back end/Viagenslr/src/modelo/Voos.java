package modelo;

import javax.xml.crypto.Data;

public class Voos {

	private int id_voo;

	private String origem_voo;

	private String destino_voo;

	private Data dataIda_voo;

	private Data dataVolta_voo;

	public Voos() {

	}

	public Voos(int id_voo, String origem_voo, String destino_voo, Data dataIda_voo, Data dataVolta_voo) {
		super();
		this.id_voo = id_voo;
		this.origem_voo = origem_voo;
		this.destino_voo = destino_voo;
		this.dataIda_voo = dataIda_voo;
		this.dataVolta_voo = dataVolta_voo;
	}

	public int getId_voo() {
		return id_voo;
	}

	public void setId_voo(int id_voo) {
		this.id_voo = id_voo;
	}

	public String getOrigem_voo() {
		return origem_voo;
	}

	public void setOrigem_voo(String origem_voo) {
		this.origem_voo = origem_voo;
	}

	public String getDestino_voo() {
		return destino_voo;
	}

	public void setDestino_voo(String destino_voo) {
		this.destino_voo = destino_voo;
	}

	public Data getDataIda_voo() {
		return dataIda_voo;
	}

	public void setDataIda_voo(Data dataIda_voo) {
		this.dataIda_voo = dataIda_voo;
	}

	public Data getDataVolta_voo() {
		return dataVolta_voo;
	}

	public void setDataVolta_voo(Data dataVolta_voo) {
		this.dataVolta_voo = dataVolta_voo;
	}
@Override
public String toString() {
	return "Voos [id_voo=" + id_voo + ",origem_voo=" + origem_voo + "]";
}
}
