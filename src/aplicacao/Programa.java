package aplicacao;

import entidade.Leitor;
import entidade.Livro;

public class Programa {


	    public static void main(String[] args) {

	        Leitor leitor = new Leitor("João", new Livro("Senhor dos Anéis", 1500, 0));
	        System.out.println("Leitor criado: \n" + leitor);
	        leitor.removerLivro(leitor.getLivroFavorito());
	        System.out.println(leitor);
	        leitor.adicionarLivro(new Livro("Scrum", 250, 0));
	        Livro livro = leitor.getEstanteLivros().get(0);
	        leitor.getLivroFavorito().adicionarPaginasLidas(101);
	        System.out.println(leitor);
	        System.out.println("Progresso: " + leitor.getLivroFavorito().verificarProgresso() + "%");
//	        leitor.removerLivro(livro);

	        System.out.println(leitor);

	    }
	}