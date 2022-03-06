package br.com.fiap.entity;

import java.util.Calendar;
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
@Table(name = "TB_DOADOR")
public class Doador {

	@Id
	@Column(name = "id_doador")
	@SequenceGenerator(name = "doador", sequenceName = "sq_tb_doador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doador")
	private int idDoador;

	@Column(name = "nm_doador")
	private String nmDoador;

	@Column(name = "email_doador")
	private String emailDoador;

	@Column(name = "telefone_doador")
	private String telefoneDoador;

	@Column(name = "endereco_doador")
	private String enderecoDoador;

	@Column(name = "cep_doador")
	private String cepDoador;

	@Column(name = "peso")
	private String peso;

	private String altura;

	private String cpf;

	@Column(name = "dt_nascimento")
	private Calendar dtNascimento;

	@Column(name = "estado_civil")
	private String estadoCivil;

	@Column(name = "fator_RH")
	private String fatorRh;

	@Column(name = "tp_sanguineo")
	private String tpSanguineo;

	// Relação

	@OneToMany(mappedBy = "doadores")
	private List<Doacao> doacoesDoador;

	// Construtores
	public Doador() {
	}

	public Doador(int idDoador, String nmDoador, String emailDoador, String telefoneDoador, String enderecoDoador,
			String cepDoador, String peso, String altura, String cpf, Calendar dtNascimento, String estadoCivil,
			String fatorRh, String tpSanguineo, List<Doacao> doacoesDoador) {
		super();
		this.idDoador = idDoador;
		this.nmDoador = nmDoador;
		this.emailDoador = emailDoador;
		this.telefoneDoador = telefoneDoador;
		this.enderecoDoador = enderecoDoador;
		this.cepDoador = cepDoador;
		this.peso = peso;
		this.altura = altura;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.estadoCivil = estadoCivil;
		this.fatorRh = fatorRh;
		this.tpSanguineo = tpSanguineo;
		this.doacoesDoador = doacoesDoador;
	}

	// Getters and Setters

	public int getIdDoador() {
		return idDoador;
	}

	public void setIdDoador(int idDoador) {
		this.idDoador = idDoador;
	}

	public String getNmDoador() {
		return nmDoador;
	}

	public void setNmDoador(String nmDoador) {
		this.nmDoador = nmDoador;
	}

	public String getEmailDoador() {
		return emailDoador;
	}

	public void setEmailDoador(String emailDoador) {
		this.emailDoador = emailDoador;
	}

	public String getTelefoneDoador() {
		return telefoneDoador;
	}

	public void setTelefoneDoador(String telefoneDoador) {
		this.telefoneDoador = telefoneDoador;
	}

	public String getEnderecoDoador() {
		return enderecoDoador;
	}

	public void setEnderecoDoador(String enderecoDoador) {
		this.enderecoDoador = enderecoDoador;
	}

	public String getCepDoador() {
		return cepDoador;
	}

	public void setCepDoador(String cepDoador) {
		this.cepDoador = cepDoador;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getFatorRh() {
		return fatorRh;
	}

	public void setFatorRh(String fatorRh) {
		this.fatorRh = fatorRh;
	}

	public String getTpSanguineo() {
		return tpSanguineo;
	}

	public void setTpSanguineo(String tpSanguineo) {
		this.tpSanguineo = tpSanguineo;
	}

	public List<Doacao> getDoacoesDoador() {
		return doacoesDoador;
	}

	public void setDoacoesDoador(List<Doacao> doacoesDoador) {
		this.doacoesDoador = doacoesDoador;
	}

	@Override
	public String toString() {
		return "Doador [idDoador=" + idDoador + ", nmDoador=" + nmDoador + ", emailDoador=" + emailDoador
				+ ", telefoneDoador=" + telefoneDoador + ", enderecoDoador=" + enderecoDoador + ", cepDoador="
				+ cepDoador + ", peso=" + peso + ", altura=" + altura + ", cpf=" + cpf + ", dtNascimento="
				+ dtNascimento + ", estadoCivil=" + estadoCivil + ", fatorRh=" + fatorRh + ", tpSanguineo="
				+ tpSanguineo + ", doacoesDoador=" + doacoesDoador + "]";
	}

}
