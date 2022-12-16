package br.com.esiggroup.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.esiggroup.model.Tarefa;

@Named
@SessionScoped
public class TarefaManageBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Tarefa tarefas;
	
	private List<Tarefa> listaTarefas = new ArrayList<Tarefa>();

	public String salvaNovaTarefa() {
		listaTarefas.add(tarefas);
		System.out.println("A tarefa: " + tarefas.getTitulo()+ " foi salva com sucesso!");
		return "";
	}
	
	public Tarefa getTarefas() {
		return tarefas;
	}

	public void setTarefas(Tarefa tarefas) {
		this.tarefas = tarefas;
	}

	public List<Tarefa> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(List<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	

}
