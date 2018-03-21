package dominio;

import java.util.List;

public abstract class Cliente {
	protected int ID;
	protected List<Contato> contatos;
	protected Endereco endereco;
	protected float saldo;
	
	protected List<Compra> compras;
	protected List<Pagamento> pagamentos;	
}
