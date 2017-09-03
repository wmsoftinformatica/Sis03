package br.com.wmsoft.sis03.model;

public enum SN {
	S("Sim"),
	N("Não");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private SN(String descricao) {
		this.descricao = descricao;
	}

}
