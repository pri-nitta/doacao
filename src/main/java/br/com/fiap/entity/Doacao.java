package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TB_DOACAO")
public class Doacao {

	// Atributos

	@Id
	@Column(name = "id_doacao", nullable = false)
	@SequenceGenerator(name = "doacao", sequenceName = "sq_tb_doacao", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doacao")
	private int idDoacao;

	@CreationTimestamp
	@Column(name = "dt_ult_coleta", nullable = false)
	private Calendar dtUltColeta;

	@Column(name = "volume_coleta", nullable = false, length = 6)
	private String volumeColeta;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	// Relacao

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_doador")
	private Doador doadores;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_centro_col")
	private CentroColeta coletas;

	// Contrutores

	public Doacao() {
	}

	public Doacao(int idDoacao, Calendar dtUltColeta, String volumeColeta, String descricao, Doador doadores,
			CentroColeta coletas) {
		super();
		this.idDoacao = idDoacao;
		this.dtUltColeta = dtUltColeta;
		this.volumeColeta = volumeColeta;
		this.descricao = descricao;
		this.doadores = doadores;
		this.coletas = coletas;
	}

	// Getters and Setters

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
