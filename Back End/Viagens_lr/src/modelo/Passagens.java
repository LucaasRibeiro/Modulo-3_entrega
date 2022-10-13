package modelo;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate; 

public class Passagens {

	private int id_passagem;
	private String nome_passagem;
	private double preco_passagem;
	private LocalDate publicacao;
	
	private Destinos destino;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
	public Passagens() {
	}


	public Passagens(int id_passagem, String nome_passsagem, double preco_passagem, String publicacao,
			Destinos destino) {
		super();
		this.id_passagem = id_passagem;
		this.nome_passagem = nome_passagem;
		this.preco_passagem = preco_passagem;
		this.publicacao = LocalDate.parse(publicacao, formatter);
		this.destino = destino;
	}


	public int getId_passagem() {
		return id_passagem;
	}


	public void setId_passagem(int id_passagem) {
		this.id_passagem = id_passagem;
	}


	public String getNome_passagem() {
		return nome_passagem;
	}


	public void setNome_passagem(String nome_passagem) {
		this.nome_passagem = nome_passagem;
	}


	public double getPreco_passagem() {
		return preco_passagem;
	}


	public void setPreco_passagem(double preco_passagem) {
		this.preco_passagem = preco_passagem;
	}


	public String getpublicacao() {
		return publicacao;
	}


	public void setpublicacao(String publicacao) {
		this.publicacao = publicacao;
	}


	public Destinos getDestinos() {
		return destino;
	}


	public void setdestinos(Destinos destinos) {
		this.destino = destino;
	}
	
}
	