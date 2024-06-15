package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List <Livro> livroList;
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
		
	}
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro livrosAutor : livroList) {
				if(livrosAutor.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livrosAutor);
				}
			}
		}
		return livrosPorAutor;
		
	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> pesquisarPorAno = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro pesquisas : livroList) {
				if(pesquisas.getAnoPublicacao() > anoInicial && pesquisas.getAnoPublicacao() <= anoFinal) {
					pesquisarPorAno.add(pesquisas);
				}
			}
		}
		return pesquisarPorAno;
		
	}
	public Livro pesquisarPorTitulo(String titulo) {
		Livro pesquisarTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro pTitulo : livroList) {
				if(pTitulo.getTitulo().equalsIgnoreCase(titulo)) {
					pesquisarTitulo = pTitulo;
					break;
				}
			}
		}
		
		return pesquisarTitulo;
	}
	public static void main(String[] args) {
		CatalogoLivros livros = new CatalogoLivros();
		
		livros.adicionarLivro("Livro 1", "Autor 1", 2020);
		livros.adicionarLivro("Livro 1", "Autor 2", 2021);
		livros.adicionarLivro("Livro 2", "Autor 2", 2022);
		livros.adicionarLivro("Livro 3", "Autor 3", 2023);
		livros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(livros.pesquisarPorTitulo("livro 1"));
	}
}
