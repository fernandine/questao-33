package entidade;

import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private String nome;
    private Livro livroFavorito;
    private List<Livro> estanteLivros;

    public Leitor(String nome, Livro livroFavorito) {
        this.nome = nome;
        this.livroFavorito = livroFavorito;
        estanteLivros = new ArrayList<>();
        estanteLivros.add(livroFavorito);
    }

    public void adicionarLivro(Livro livro) {

        this.estanteLivros.add(livro);
    }

    public void removerLivro(Livro livro) {

        this.estanteLivros.remove(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(Livro livroFavorito) {
        this.livroFavorito = livroFavorito;
    }

    public List<Livro> getEstanteLivros() {
        return estanteLivros;
    }

    public void setEstanteLivros(List<Livro> estanteLivros) {
        this.estanteLivros = estanteLivros;
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "nome='" + nome + '\'' +
                ", livroFavorito=" + livroFavorito +
                ", estanteLivros=" + estanteLivros +
                '}';
    }
}