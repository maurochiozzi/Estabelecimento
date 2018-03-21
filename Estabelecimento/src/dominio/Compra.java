package dominio;

import java.util.List;

public class Compra {
	private int ID;
	private float total;
	private String data;
	private List<Produto> produtos;

	public Compra() {
		this.total = 0f;
	}

	public void calcularTotal() {
		for (Produto produto : produtos) {
			total += produto.getPrecoUnitario() * produto.getQuantidade();
		}
	}

}
