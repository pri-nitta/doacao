package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CENTRO_COLETA")
public class CentroColeta {
	
	@Id
	@Column(name="id_centro_col")
	@SequenceGenerator(name="centro_col", sequenceName="sq_tb_centro_coleta", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="centro_col")
	private int idCentroCol;
	
	@Column(name="nm_centro_col", nullable=false)
	private String nmCentroCol;
	
	@Column(name="cnpj", nullable=false)
	private String cnpj;
	
	@Column(name="endereco_centro_col", nullable=false)
	private String enderecoCentroCol; 
	
	@Column(name="cep_centro_col", nullable=false)
	private String cepCentroCol;
	
	@Column(name="telefone_centro_col", nullable=false)
	private String telefoneCentroCol;

	// relacao 
	
	@OneToMany(mappedBy = "coletas")  
	private List<Doacao> doacoesCentro;
	
	
	// Contrutores 
	
	public CentroColeta() {}
	
	public CentroColeta(int idCentroCol, String nmCentroCol, String cnpj, String enderecoCentroCol, String cepCentroCol,
			String telefoneCentroCol, List<Doacao> doacoesCentro) {
		super();
		this.idCentroCol = idCentroCol;
		this.nmCentroCol = nmCentroCol;
		this.cnpj = cnpj;
		this.enderecoCentroCol = enderecoCentroCol;
		this.cepCentroCol = cepCentroCol;
		this.telefoneCentroCol = telefoneCentroCol;
		this.doacoesCentro = doacoesCentro;
	}

	// Getters and Setters 
	
	public int getIdCentroCol() {
		return idCentroCol;
	}

	public void setIdCentroCol(int idCentroCol) {
		this.idCentroCol = idCentroCol;
	}
	
	public String getNmCentroCol() {
		return nmCentroCol;
	}

	public void setNmCentroCol(String nmCentroCol) {
		this.nmCentroCol = nmCentroCol;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEnderecoCentroCol() {
		return enderecoCentroCol;
	}
	public void setEnderecoCentroCol(String enderecoCentroCol) {
		this.enderecoCentroCol = enderecoCentroCol;
	}
	public String getCepCentroCol() {
		return cepCentroCol;
	}
	public void setCepCentroCol(String cepCentroCol) {
		this.cepCentroCol = cepCentroCol;
	}
	public String getTelefoneCentroCol() {
		return telefoneCentroCol;
	}
	public void setTelefoneCentroCol(String telefoneCentroCol) {
		this.telefoneCentroCol = telefoneCentroCol;
	}
	
	public List<Doacao> getDoacoesCentro() {
		return doacoesCentro;
	}

	public void setDoacoesCentro(List<Doacao> doacoesCentro) {
		this.doacoesCentro = doacoesCentro;
	}

	@Override
	public String toString() {
		return "CentroColeta [idCentroCol=" + idCentroCol + ", nmCentroCol=" + nmCentroCol + ", cnpj=" + cnpj
				+ ", enderecoCentroCol=" + enderecoCentroCol + ", cepCentroCol=" + cepCentroCol + ", telefoneCentroCol="
				+ telefoneCentroCol + ", doacoesCentro=" + doacoesCentro + "]";
	}

}
