package dominio;

public class Produto {
	private String nome;
	private String IMCS;
	private float quantidade;
	private float precoUnitario;
	private float peso;
	private float custoUnitario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIMCS() {
		return IMCS;
	}

	public void setIMCS(String iMCS) {
		IMCS = iMCS;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getCustoUnitario() {
		return custoUnitario;
	}

	public void setCustoUnitario(float custoUnitario) {
		this.custoUnitario = custoUnitario;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", IMCS=" + IMCS + ", peso=" + peso + ", precoUnitario=" + precoUnitario
				+ ", custoUnitario=" + custoUnitario + "]";
	}
}
