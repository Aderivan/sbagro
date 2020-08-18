package com.api.sbagro.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRRHM04 ")
public class Movimentacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;

	private String dataeve;
	private String codeve;
	private Integer seqeve;
	private String engtrb;
	private Double qtdeve;
	private Double qtdaco;
	private Double qtdobt;
	private Double valotar;
	private Double indice;
	private Integer flag;
	private String lote;
	private String cabo;
	private Double desp_prod;
	private Integer sr_recno;
	private String sr_deleted;
	private String usuario;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDataeve() {
		return dataeve;
	}

	public void setDataeve(String dataeve) {
		this.dataeve = dataeve;
	}

	public String getCodeve() {
		return codeve;
	}

	public void setCodeve(String codeve) {
		this.codeve = codeve;
	}

	public Integer getSeqeve() {
		return seqeve;
	}

	public void setSeqeve(Integer seqeve) {
		this.seqeve = seqeve;
	}

	public String getEngtrb() {
		return engtrb;
	}

	public void setEngtrb(String engtrb) {
		this.engtrb = engtrb;
	}

	public Double getQtdeve() {
		return qtdeve;
	}

	public void setQtdeve(Double qtdeve) {
		this.qtdeve = qtdeve;
	}

	public Double getQtdaco() {
		return qtdaco;
	}

	public void setQtdaco(Double qtdaco) {
		this.qtdaco = qtdaco;
	}

	public Double getQtdobt() {
		return qtdobt;
	}

	public void setQtdobt(Double qtdobt) {
		this.qtdobt = qtdobt;
	}

	public Double getValotar() {
		return valotar;
	}

	public void setValotar(Double valotar) {
		this.valotar = valotar;
	}

	public Double getIndice() {
		return indice;
	}

	public void setIndice(Double indice) {
		this.indice = indice;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getCabo() {
		return cabo;
	}

	public void setCabo(String cabo) {
		this.cabo = cabo;
	}

	public Double getDesp_prod() {
		return desp_prod;
	}

	public void setDesp_prod(Double desp_prod) {
		this.desp_prod = desp_prod;
	}

	public Integer getSr_recno() {
		return sr_recno;
	}

	public void setSr_recno(Integer sr_recno) {
		this.sr_recno = sr_recno;
	}

	public String getSr_deleted() {
		return sr_deleted;
	}

	public void setSr_deleted(String sr_deleted) {
		this.sr_deleted = sr_deleted;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
