package modelo;

public class Passagens {
	private int id_passagens;

	private int aereas_passagens;

	private int onibus_passagens;

	public Passagens() {

	}

	public Passagens(int id_passagens, int aereas_passagens, int onibus_passagens) {
		super();
		this.id_passagens = id_passagens;
		this.aereas_passagens = aereas_passagens;
		this.onibus_passagens = onibus_passagens;
	}

	public int getId_passagens() {
		return id_passagens;
	}

	public void setId_passagens(int id_passagens) {
		this.id_passagens = id_passagens;
	}

	public int getAereas_passagens() {
		return aereas_passagens;
	}

	public void setAereas_passagens(int aereas_passagens) {
		this.aereas_passagens = aereas_passagens;
	}

	public int getOnibus_passagens() {
		return onibus_passagens;
	}

	public void setOnibus_passagens(int onibus_passagens) {
		this.onibus_passagens = onibus_passagens;
	}

}
