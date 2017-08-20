package br.com.wmsoft.sis03.model;

public enum UF {
	
		AC("Acre"),		 
		AL("Alagoas"),		 
		AP("Amapá"),		 
		AM("Amazonas"),		 
		BA("Bahia"),		 
		CE("Ceará"),		 
		DF("Distrito Federal"),		 
		ES("Espírito Santo"),		 
		GO("Goiás"),		 
		MA("Maranhão"),		 
		MT("Mato Grosso"),		 
		MS("Mato Grosso do Sul"),		 
		MG("Pará"),		 
		PB("Paraíba"),		 
		PR("Paraná"),		 
		PE("Pernambuco"),		 
		PI("Piauí"),		 
		RJ("Rio de Janeiro"),		 
		RN("Rio Grande do Norte"),		 
		RS("Rio Grande do Sul"),	 
		RO("Rondônia"),		 
		RR("Roraima"),		 
		SC("Santa Catarina"),		 
		SP("São Paulo"),		 
		SE("Sergipe"),		 
		TO("Tocantins");
	
		private String descricao;

		public String getDescricao() {
			return descricao;
		}

		private UF(String descricao) {
			this.descricao = descricao;
		}

		
}
