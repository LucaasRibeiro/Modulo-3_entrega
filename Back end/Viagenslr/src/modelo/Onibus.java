package modelo;

import javax.xml.crypto.Data;

public class Onibus {

	private int id_onibus;
	private String origem_onibus;
	private String destino_onibus;
	private Data dataIda_onibus;
	private Data dataVolta_onibus;

	public Onibus() {

	}

	public Onibus(int id_onibus, String origem_onibus, String destino_onibus, Data dataIda_onibus,
			Data dataVolta_onibus) {
		super();
		this.id_onibus = id_onibus;
		this.origem_onibus = origem_onibus;
		this.destino_onibus = destino_onibus;
		this.dataIda_onibus = dataIda_onibus;
		this.dataVolta_onibus = dataVolta_onibus;
	}

	public int getId_onibus() {
		return id_onibus;
	}

	public void setId_onibus(int id_onibus) {
		this.id_onibus = id_onibus;
	}

	public String getOrigem_onibus() {
		return origem_onibus;
	}

	public void setOrigem_onibus(String origem_onibus) {
		this.origem_onibus = origem_onibus;
	}

	public String getDestino_onibus() {
		return destino_onibus;
	}

	public void setDestino_onibus(String destino_onibus) {
		this.destino_onibus = destino_onibus;
	}

	public Data getDataIda_onibus() {
		return dataIda_onibus;
	}

	public void setDataIda_onibus(Data dataIda_onibus) {
		this.dataIda_onibus = dataIda_onibus;
	}

	public Data getDataVolta_onibus() {
		return dataVolta_onibus;
	}

	public void setDataVolta_onibus(Data dataVolta_onibus) {
		this.dataVolta_onibus = dataVolta_onibus;
	}

}
