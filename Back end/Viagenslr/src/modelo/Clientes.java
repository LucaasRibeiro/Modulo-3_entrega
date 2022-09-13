package modelo;

public class Clientes {

	private int id_cliente;

	private String nome_cliente;

	private String cpf_cliente;

	private String rg_cliente;

	private String email_cliente;

	private String senha_cliente;

	private String telefone_cliente;

	private String rua_cliente;

	private String numero_cliente;

	private String cep_cliente;

	private String bairro_cliente;

	private String cidade_cliente;

	private String estado_cliente;

	private String pais_cliente;

	public Clientes() {

	}

	public Clientes(int id_cliente, String nome_cliente, String cpf_cliente, String rg_cliente, String email_cliente,
			String senha_cliente, String telefone_cliente, String rua_cliente, String numero_cliente,
			String cep_cliente, String bairro_cliente, String cidade_cliente, String estado_cliente,
			String pais_cliente) {
		super();
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.rg_cliente = rg_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
		this.telefone_cliente = telefone_cliente;
		this.rua_cliente = rua_cliente;
		this.numero_cliente = numero_cliente;
		this.cep_cliente = cep_cliente;
		this.bairro_cliente = bairro_cliente;
		this.cidade_cliente = cidade_cliente;
		this.estado_cliente = estado_cliente;
		this.pais_cliente = pais_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getRg_cliente() {
		return rg_cliente;
	}

	public void setRg_cliente(String rg_cliente) {
		this.rg_cliente = rg_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public String getRua_cliente() {
		return rua_cliente;
	}

	public void setRua_cliente(String rua_cliente) {
		this.rua_cliente = rua_cliente;
	}

	public String getNumero_cliente() {
		return numero_cliente;
	}

	public void setNumero_cliente(String numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public String getCep_cliente() {
		return cep_cliente;
	}

	public void setCep_cliente(String cep_cliente) {
		this.cep_cliente = cep_cliente;
	}

	public String getBairro_cliente() {
		return bairro_cliente;
	}

	public void setBairro_cliente(String bairro_cliente) {
		this.bairro_cliente = bairro_cliente;
	}

	public String getCidade_cliente() {
		return cidade_cliente;
	}

	public void setCidade_cliente(String cidade_cliente) {
		this.cidade_cliente = cidade_cliente;
	}

	public String getEstado_cliente() {
		return estado_cliente;
	}

	public void setEstado_cliente(String estado_cliente) {
		this.estado_cliente = estado_cliente;
	}

	public String getPais_cliente() {
		return pais_cliente;
	}

	public void setPais_cliente(String pais_cliente) {
		this.pais_cliente = pais_cliente;
	}

}
