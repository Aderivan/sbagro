package com.api.sbagro.domain.model;

import javax.persistence.Column;
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

	@Column(name = "tipeve")
	private String tipoEvento;

	@Column(name = "valmax")
	private Double valorMaximo;

	@Column(name = "valmin")
	private Double valorMinimo;

	@Column(name = "valpad")
	private Double valorPadrao;

	@Column(name = "percen")
	private Double percentual;

	@Column(name = "sr_deleted")
	private String eventoDeletado;

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

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Double getValorPadrao() {
		return valorPadrao;
	}

	public void setValorPadrao(Double valorPadrao) {
		this.valorPadrao = valorPadrao;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public String getEventoDeletado() {
		return eventoDeletado;
	}

	public void setEventoDeletado(String eventoDeletado) {
		this.eventoDeletado = eventoDeletado;
	}

}
