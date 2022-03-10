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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_DOADOR")
public class Doador {

	@Id
	@Column(name = "id_doador")
	@SequenceGenerator(name = "doador", sequenceName = "sq_tb_doador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doador")
	private int idDoador;

	@Column(name = "nm_doador", nullable = false, length = 50)
	private String nmDoador;

	@Column(name = "email_doador", nullable = false, length = 80)
	private String emailDoador;

	@Column(name = "senha", nullable = false, length = 30)
	private String senha;

	@Column(name = "telefone_doador", nullable = false, length = 15)
	private String telefoneDoador;

	@Column(name = "endereco_doador", nullable = false, length = 80)
	private String enderecoDoador;

	@Column(name = "cep_doador", nullable = false, length = 8)
	private char cepDoador;

	@Column(name = "peso", nullable = false)
	private float peso;

	@Column(name = "altura", nullable = false)
	private float altura;

	@Column(name = "cpf", nullable = false, length = 14)
	private String cpf;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dtNascimento;

	@Column(name = "estado_civil", length = 8)
	private String estadoCivil;

	@Column(name = "fator_rh", nullable = false, length = 8)
	private String fatorRh;

	@Column(name = "tp_sanguineo", nullable = false, length = 3)
	private String tpSanguineo;

	// Relação

	@OneToMany(mappedBy = "doadores")
	private List<Doacao> doacoesDoador;

	// Construtores
	public Doador() {
	}

	public Doador(int idDoador, String nmDoador, String emailDoador, String senha, String telefoneDoador,
			String enderecoDoador, char cepDoador, float peso, float altura, String cpf, Calendar dtNascimento,
			String estadoCivil, String fatorRh, String tpSanguineo, List<Doacao> doacoesDoador) {
		super();
		this.idDoador = idDoador;
		this.nmDoador = nmDoador;
		this.emailDoador = emailDoador;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setCepDoador(char cepDoador) {
		this.cepDoador = cepDoador;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public char getCepDoador() {
		return cepDoador;
	}

	public float getPeso() {
		return peso;
	}

	public float getAltura() {
		return altura;
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
