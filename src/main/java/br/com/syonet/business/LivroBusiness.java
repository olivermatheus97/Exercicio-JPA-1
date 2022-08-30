package br.com.syonet.business;

import java.util.Objects;

import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Livro;

public class LivroBusiness {

	private LivroDAO dao = new LivroDAO();

	public void salva(Livro registro) {
		if (Objects.isNull(registro)) {
			throw new NullPointerException("O Registro está nulo!");
		}
		if (Objects.isNull(registro.getTitulo())) {
			throw new IllegalArgumentException("O Titulo não pode ser nulo");
		}
		if (Objects.isNull(registro.getEditora())) {
			throw new IllegalArgumentException("A Editora não pode ser nulo");
		}
		if (Objects.isNull(registro.getNomeAutor())) {
			throw new IllegalArgumentException("O nome do autor não pode ser nulo");
		}
		this.dao.salva(registro);
	}
}