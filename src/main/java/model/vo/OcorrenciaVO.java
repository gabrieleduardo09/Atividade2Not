package model.vo;

import java.util.Date;

//import java.sql.Date;

public class OcorrenciaVO {

	private int id;
	private Date data;
	private String descricao;
	private String local;
	private CidadaoVO id_cidadao;
	
	public OcorrenciaVO(int id, Date data, String descricao, String local, CidadaoVO id_cidadao) {
		super();
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.local = local;
		this.id_cidadao = id_cidadao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public CidadaoVO getId_cidadao() {
		return id_cidadao;
	}

	public void setId_cidadao(CidadaoVO id_cidadao) {
		this.id_cidadao = id_cidadao;
	}
	
}
