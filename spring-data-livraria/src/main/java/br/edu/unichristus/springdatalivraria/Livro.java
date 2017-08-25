package br.edu.unichristus.springdatalivraria;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "TB_LIVRO")
	public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LIVRO_ID")
	private Long livroID;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "DATA_PUBLICACAO")
	private Date dataPublicacao;
	@Column(name = "NUMERO_PAGINAS")
	private int numeroPaginas;
	@Column(name = "PRECO")
	private BigDecimal preco;
	//construtores abaixo , são gerados dois devido ter criado um construtor default
	public Livro() {
	}
	
	public Livro(String titulo, Date dataPublicacao, int numeroPaginas, BigDecimal
	preco) {
	this.titulo = titulo;
	this.dataPublicacao = dataPublicacao;
	this.numeroPaginas = numeroPaginas;
	this.preco = preco;
	}

	public Long getLivroID() {
		return livroID;
	}

	public void setLivroID(Long livroID) {
		this.livroID = livroID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [livroID=" + livroID + ", titulo=" + titulo + ", dataPublicacao=" + dataPublicacao
				+ ", numeroPaginas=" + numeroPaginas + ", preco=" + preco + "]";
	}
	
	
}
