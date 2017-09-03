package br.com.wmsoft.sis03.controller;

public enum Imprimir {
	S("Sim"),
	N("Não");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private Imprimir(String descricao) {
		this.descricao = descricao;
	}

}
