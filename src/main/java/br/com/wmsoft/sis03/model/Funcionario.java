package br.com.wmsoft.sis03.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	private String endereco;
	private String cidade;
	private String bairro;
	private String uf;
	private String cep;
	private String telefone1;
	private String telefone2;
	private String email;
	private String cpf;
	private String rg;
	private String banco;
	private String agencia;
	private String conta;
	private Integer salario;
	private Date datapagamento;
	private Date datacadastro;
	private String funcionarioAtivo;
	private String vendedor;
	private String usuario;
	private Integer comissao;
	
	
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	public Date getDatapagamento() {
		return datapagamento;
	}
	public void setDatapagamento(Date datapagamento) {
		this.datapagamento = datapagamento;
	}
	public Date getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	
	public String getFuncionarioAtivo() {
		return funcionarioAtivo;
	}
	public void setFuncionarioAtivo(String funcionarioAtivo) {
		this.funcionarioAtivo = funcionarioAtivo;
	}
	
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Integer getComissao() {
		return comissao;
	}
	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}
	public Boolean isNovo(){
		
		return codigo == null;
	}
     
	
}
