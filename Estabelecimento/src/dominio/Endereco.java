package dominio;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String CEP;
	private int numero;

	// Metodos setter e getters
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// metodo para imprimir
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", CEP=" + CEP + ", cidade="
				+ cidade + ", estado=" + estado + ", pais=" + pais + "]";
	}
}
