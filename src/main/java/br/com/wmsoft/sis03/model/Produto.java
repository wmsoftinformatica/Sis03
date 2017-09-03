package br.com.wmsoft.sis03.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.wmsoft.sis03.controller.Imprimir;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String descricao;
	private String setor;
	private String fornecedor;
	private String fabricante;
	private String un;
	private Integer precoCusto;
	private Integer precoVenda;
	private Integer qtd;
	private Integer qtdMinima;
	private Integer cst;
	private Integer aliquotaIpi;
	private Integer codigoIpi;
	private Integer pesoBruto;
	private Integer pesoLiquido;
	private Integer icms;
	private Integer iss;
	private Integer simples;
	private Integer complementoPorcentagem;
	private String complemento1;
	private String complemento2;
	
	@Enumerated(EnumType.STRING)
	private SN complemento;
	
	public SN getSn() {
		return complemento;
	}
	public void setSn(SN sn) {
		this.complemento = sn;
	}
	
	
	
	@Enumerated(EnumType.STRING)
	private Imprimir imprimirProduto;
	
	public Imprimir getImprimir() {
		return imprimirProduto;
	}
	public void setImprimir(Imprimir imprimir) {
		this.imprimirProduto = imprimir;
	}	
	
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
    public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public Integer getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(Integer precoCusto) {
		this.precoCusto = precoCusto;
	}
	public Integer getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Integer precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Integer getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(Integer qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public Integer getCst() {
		return cst;
	}
	public void setCst(Integer cst) {
		this.cst = cst;
	}
	public Integer getAliquotaIpi() {
		return aliquotaIpi;
	}
	public void setAliquotaIpi(Integer aliquotaIpi) {
		this.aliquotaIpi = aliquotaIpi;
	}
	public Integer getCodigoIpi() {
		return codigoIpi;
	}
	public void setCodigoIpi(Integer codigoIpi) {
		this.codigoIpi = codigoIpi;
	}
	public Integer getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(Integer pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public Integer getPesoLiquido() {
		return pesoLiquido;
	}
	public void setPesoLiquido(Integer pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}
	public Integer getIcms() {
		return icms;
	}
	public void setIcms(Integer icms) {
		this.icms = icms;
	}
	public Integer getIss() {
		return iss;
	}
	public void setIss(Integer iss) {
		this.iss = iss;
	}
	public Integer getSimples() {
		return simples;
	}
	public void setSimples(Integer simples) {
		this.simples = simples;
	}
	public Integer getComplementoPorcentagem() {
		return complementoPorcentagem;
	}
	public void setComplementoPorcentagem(Integer complementoPorcentagem) {
		this.complementoPorcentagem = complementoPorcentagem;
	}
	public String getComplemento1() {
		return complemento1;
	}
	public void setComplemento1(String complemento1) {
		this.complemento1 = complemento1;
	}
	public String getComplemento2() {
		return complemento2;
	}
	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}
	public Boolean isNovo(){
		return codigo == null;
	}

}
