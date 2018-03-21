package mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dominio.Produto;

@ManagedBean(eager = true)
@RequestScoped
public class ProdutoMBean {
	private Produto produto;
	
	public String cadastrar(){
		ProdutoProcessador produtoProcessador = new ProdutoProcessador();
		
		produtoProcessador.cadastrar(this.produto);
		
		return "produtocadastrado";	
	}
	
	public String remover(){
		ProdutoProcessador produtoProcessador = new ProdutoProcessador();
		
		try{
			produtoProcessador.remover(this.produto);
			return "removerproduto";
		}catch(Exception e){
			return e.toString();
		}
	}
	
	public String atualizar(){
		ProdutoProcessador produtoProcessador = new ProdutoProcessador();
		
		try{
			pessoaProcessador.atualizar(this.produto);
		}catch(Exception e){
			return e.toString();
		}
	}
	
	public void consultarByName(){
		
	}
}
