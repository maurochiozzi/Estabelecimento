package dominio;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nomeContato;
	private List<String> numeros;
	private List<String> emails;
	
	public Contato(String nomeContato){
		this.nomeContato = nomeContato;
		this.numeros = new ArrayList<String>();
		this.emails = new ArrayList<String>();
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public void addNumero(String numero){
		this.numeros.add(numero);
	}
	
	public void removeNumero(String numero){
		this.numeros.remove(numero);
	}
	
	public String getNumero(int index){
		return this.numeros.get(index);
	}
	
	public List<String> getNumeros(){
		return this.numeros;
	}
	
	public void addEmail(String email){
		this.emails.add(email);
	}
	
	public void removeEmail(String email){
		this.emails.remove(email);
	}
	
	public String getEmail(int index){
		return this.emails.get(index);
	}
	
	public List<String> getEmails(){
		return this.emails;
	}

	@Override
	public String toString(){
		return "Contato [nomeContato=" + this.nomeContato + ", numeros=" + this.numeros.size() +
				", emails=" + this.emails.size() + "]";
	}
}
