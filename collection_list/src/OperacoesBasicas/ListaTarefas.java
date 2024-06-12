package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefas listatarefas = new ListaTarefas();
		
		listatarefas.adicionarTarefa("Correr");
		listatarefas.adicionarTarefa("Correr2");
		listatarefas.adicionarTarefa("Correr");
		
//		listatarefas.removerTarefa("Correr");
		System.out.println("O número total de elementos na lista é: " + listatarefas.obterNumeroTotalDeTarefas());
		listatarefas.obterDescricaoTarefas();
	}

}
