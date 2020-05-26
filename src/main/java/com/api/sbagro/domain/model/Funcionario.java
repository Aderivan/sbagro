package com.api.sbagro.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRRHC01")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
	
	@Column(name = "nomfun")
	private String nomeDoFuncionario;
	
	@Column(name = "datadm")
	private Date dataAdmissao;
	
	@Column(name = "datdem")
	private Date dataDemissao;
	
	@Column(name = "inigfer")
	private Date inicioDeFerias;
	
	@Column(name = "fingfer")
	private Date fimDeFerias;
	
	@Column(name = "sr_deleted")
	private String funcionarioDeletado;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeDaFuncao() {
		return nomeDoFuncionario;
	}

	public void setNomeDaFuncao(String nomeDaFuncao) {
		this.nomeDoFuncionario = nomeDaFuncao;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Date getInicioDeFerias() {
		return inicioDeFerias;
	}

	public void setInicioDeFerias(Date inicioDeFerias) {
		this.inicioDeFerias = inicioDeFerias;
	}

	public Date getFimDeFerias() {
		return fimDeFerias;
	}

	public void setFimDeFerias(Date fimDeFerias) {
		this.fimDeFerias = fimDeFerias;
	}

	public String getFuncionarioDeletado() {
		return funcionarioDeletado;
	}

	public void setFuncionarioDeletado(String funcionarioDeletado) {
		this.funcionarioDeletado = funcionarioDeletado;
	}		
}
