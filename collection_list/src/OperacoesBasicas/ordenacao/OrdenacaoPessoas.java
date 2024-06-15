package OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List <Pessoa> pessoaList;
	
	public static void main(String[] args) {
	
		OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
		pessoas.adicionarPessoas("nome 1", 20, 1.56);
		pessoas.adicionarPessoas("nome 2", 30, 1.80);
		pessoas.adicionarPessoas("nome 3", 25, 1.70);
		pessoas.adicionarPessoas("nome 4", 17, 1.56);
		
		System.out.println(pessoas.ordenaPorIdade());
		System.out.println(pessoas.ordenarPorAltura());

	}
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	public void adicionarPessoas(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenaPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new comparatorPoraltura());
		return pessoasPorAltura;
	}
	
	
}
