package br.com.syonet.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "syo_livro")
public class Livro {

	@Column(nullable = false)
	private String titulo;

	@Column(nullable = true)
	private String tituloOriginal;

	@Column(nullable = false)
	private String nomeAutor;

	@Column(nullable = true)
	private String editora;

	@Column(nullable = true, name = "no_paginas")
	private Integer numPag;

	@Column(nullable = true, name = "no_edicao")
	private Integer numEdi;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLivro;

//	public Livro(String titulo, String nomeAutor) {
//		super();
//		this.titulo = titulo;
//		this.nomeAutor = nomeAutor;
//	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getNumPag() {
		return numPag;
	}

	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}

	public Integer getNumEdi() {
		return numEdi;
	}

	public void setNumEdi(Integer numEdi) {
		this.numEdi = numEdi;
	}

}
