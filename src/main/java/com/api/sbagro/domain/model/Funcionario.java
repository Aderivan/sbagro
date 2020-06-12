package com.api.sbagro.domain.model;

import java.util.Date;

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

	private String nomfun;

	private Date datadm;

	private Date datdem;

	private Date inigfer;

	private Date fingfer;

	private Double salbas;

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

	public String getNomfun() {
		return nomfun;
	}

	public void setNomfun(String nomfun) {
		this.nomfun = nomfun;
	}

	public Date getDatadm() {
		return datadm;
	}

	public void setDatadm(Date datadm) {
		this.datadm = datadm;
	}

	public Date getDatdem() {
		return datdem;
	}

	public void setDatdem(Date datdem) {
		this.datdem = datdem;
	}

	public Date getInigfer() {
		return inigfer;
	}

	public void setInigfer(Date inigfer) {
		this.inigfer = inigfer;
	}

	public Date getFingfer() {
		return fingfer;
	}

	public void setFingfer(Date fingfer) {
		this.fingfer = fingfer;
	}

	public Double getSalbas() {
		return salbas;
	}

	public void setSalbas(Double salbas) {
		this.salbas = salbas;
	}

	public String getSr_deleted() {
		return sr_deleted;
	}

	public void setSr_deleted(String sr_deleted) {
		this.sr_deleted = sr_deleted;
	}

}
