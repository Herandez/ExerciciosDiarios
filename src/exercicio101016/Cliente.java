package exercicio101016;

public class Cliente {
	String nome;
	String morada;
	String distrito;
	String contactos;
	int nif;
	int idade;

	public Cliente(String nome, String morada, String distrito, String contactos, int nif, int idade) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.distrito = distrito;
		this.contactos = contactos;
		this.nif = nif;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getContactos() {
		return contactos;
	}
	public void setContactos(String contactos) {
		this.contactos = contactos;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
