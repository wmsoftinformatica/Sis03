package br.com.wmsoft.sis03.model;

public enum ClienteAtivo {
	S("Sim"),
	N("Não");
	
	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	private ClienteAtivo(String descricao) {
		this.descricao = descricao;
	}
	

}
