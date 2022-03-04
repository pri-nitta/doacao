package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_DOACAO")
public class Doacao {
	
	// Atributos
	
	@Id
	@Column(name="id_doaco")
	@SequenceGenerator(name="doacao", sequenceName="sq_tb_doacao", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="doacao")
	private int idDoacao;
	
	@Column(name="dt_ultColeta")
	private Calendar dtUltColeta;
	
	@Column(name="volume_coleta")
	private String volumeColeta;
	
	
	// Relacao 
	
	@ManyToOne         			
	private Doador doadores;
	
	@ManyToOne         			
	private CentroColeta coletas;

	
	// Contrutores 
	
	public Doacao(){}
	
	public Doacao(int idDoacao, Calendar dtUltColeta, String volumeColeta, Doador doadores, CentroColeta coletas) {
		super();
		this.idDoacao = idDoacao;
		this.dtUltColeta = dtUltColeta;
		this.volumeColeta = volumeColeta;
		this.doadores = doadores;
		this.coletas = coletas;
	}
	
	// Getters and Settes
	
	public int getIdDoacao() {
		return idDoacao;
	}

	public void setIdDoacao(int idDoacao) {
		this.idDoacao = idDoacao;
	}

	public Calendar getDtUltColeta() {
		return dtUltColeta;
	}

	public void setDtUltColeta(Calendar dtUltColeta) {
		this.dtUltColeta = dtUltColeta;
	}

	public String getVolumeColeta() {
		return volumeColeta;
	}

	public void setVolumeColeta(String volumeColeta) {
		this.volumeColeta = volumeColeta;
	}

	public Doador getDoadores() {
		return doadores;
	}

	public void setDoadores(Doador doadores) {
		this.doadores = doadores;
	}

	public CentroColeta getColetas() {
		return coletas;
	}

	public void setColetas(CentroColeta coletas) {
		this.coletas = coletas;
	}
	
}
