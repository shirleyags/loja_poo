package br.com.gft.model;

public class Livro extends Produto{
	
	String autor;
	String tema;
	int quantidadePagina;
	
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQuantidadePagina() {
		return quantidadePagina;
	}
	public void setQuantidadePagina(int quantidadePagina) {
		this.quantidadePagina = quantidadePagina;
	}
	
	

}
