package com.conatus.conatussb.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTOS")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	public Product() {
		
	}
	
	public Product(Integer codigo, String descricao, Double preco, String data_cadastro, String data_alteracao,	String usuario, String observacao, String inativo) {
		setCodigo(codigo);
		setDescricao(descricao);
		setPreco(preco);
		setData_cadastro(data_cadastro);
		setData_alteracao(data_alteracao);
		setUsuario(usuario);
		setObservacao(observacao);
		setInativo(inativo);
	}

	@Id
	@Column(name="COD_PRODUTOS")
	private Integer codigo;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="PRECO")
	private Double preco;
	
	@Column(name="DATA_CADASTRO")
	private String data_cadastro;
	
	@Column(name="DATA_ALTERACAO")
	private String data_alteracao;
	
	@Column(name="USUARIO")
	private String usuario;// Para gravar o usuario que realizou o cadastro
	
	@Column(name="INATIVO")
	private String inativo;
	
	@Column(name="OBSERVACAO")
	private String observacao;

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao(String data_alteracao) {
		this.data_alteracao = data_alteracao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	
}
