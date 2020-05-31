package com.api.sbagro.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRRHT01")
public class Eventos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;

	private String nome;

	private String tipeve;

	private Double valmax;

	private Double valmin;

	private Double valpad;

	private Double percen;

	private String sr_deleted;

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
		Eventos other = (Eventos) obj;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipeve() {
		return tipeve;
	}

	public void setTipeve(String tipeve) {
		this.tipeve = tipeve;
	}

	public Double getValmax() {
		return valmax;
	}

	public void setValmax(Double valmax) {
		this.valmax = valmax;
	}

	public Double getValmin() {
		return valmin;
	}

	public void setValmin(Double valmin) {
		this.valmin = valmin;
	}

	public Double getValpad() {
		return valpad;
	}

	public void setValpad(Double valpad) {
		this.valpad = valpad;
	}

	public Double getPercen() {
		return percen;
	}

	public void setPercen(Double percen) {
		this.percen = percen;
	}

	public String getSr_deleted() {
		return sr_deleted;
	}

	public void setSr_deleted(String sr_deleted) {
		this.sr_deleted = sr_deleted;
	}

}
