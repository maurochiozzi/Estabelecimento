package mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dominio.Vendedor;
import processador.VendedorProcessador;

@ManagedBean(eager = true)
@SessionScoped
public class VendedorMBean {
	private Vendedor vendedor;
	
	public String login(){
		VendedorProcessador vendedorProcessador = new VendedorProcessador();
		
		if(vendedorProcessador.fazerLogin(this.vendedor)){
			return "home";
		}else{
			return "erro";
		}
	}
}
