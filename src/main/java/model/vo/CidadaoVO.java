package model.vo;

public class CidadaoVO {

	private int id;
	private String nome;
	private float numeroDocumento;
	private String endereco;
	private String telefone;
	private String email;
	
	public CidadaoVO(int id, String nome, float numeroDocumento, String endereco, String telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public CidadaoVO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(float numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
