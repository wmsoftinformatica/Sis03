package br.com.wmsoft.sis03.model;

public enum TipoPessoa {
	F("Fisica"),
	J("Juridica");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

    TipoPessoa(String descricao) {
		this.descricao = descricao;
	}

	
	

}
