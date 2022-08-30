package br.com.syonet.main;

import br.com.syonet.business.LivroBusiness;
import br.com.syonet.entidade.Livro;

public class Main {
	public static void main(String[] args) {
		Livro livro1 = new Livro();

		livro1.setTitulo("Morro dos ventos uivantes");
		livro1.setEditora("sapato");
		livro1.setNomeAutor("saltador");
		System.out.println("Livro em memoria " + livro1.getTitulo());

		LivroBusiness business = new LivroBusiness();
		business.salva(livro1);
		System.out.println("Livro Salvo");

	}

}