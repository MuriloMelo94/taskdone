package br.com.esiggroup.model;

import java.io.Serializable;

public class Tarefa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private String deadline;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	

}
