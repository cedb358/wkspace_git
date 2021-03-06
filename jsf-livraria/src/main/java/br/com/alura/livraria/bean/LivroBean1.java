package br.com.alura.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.alura.livraria.dao.DAO;
import br.com.alura.livraria.modelo.Livro;

@ManagedBean
public class LivroBean1 {
	
	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
   
	public void gravar() {
        System.out.println("Gravando livro " + this.livro.getTitulo());
        
        if(livro.getAutores().isEmpty()) {
        	throw new RuntimeException("Livro deve ter pelo menos um Autor");
        }
        
        new DAO<Livro>(Livro.class).adiciona(this.livro);
    }

}
